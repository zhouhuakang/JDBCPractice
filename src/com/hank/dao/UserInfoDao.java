package com.hank.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hank.db.DBUtil;
import com.hank.modal.UserInfo;

public class UserInfoDao {

	public void addUser(UserInfo userInfo) throws Exception {
		Connection conn = DBUtil.getConnection();
		String sql = "" + "insert into user_info"
				+ "(user_name,sex,age,birthday,email,mobile,"
				+ "create_user,create_date,update_user,update_date,isdel)"
				+ "values("
				+ "?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setString(1, userInfo.getUser_name());
		preparedStatement.setInt(2, userInfo.getSex());
		preparedStatement.setInt(3, userInfo.getAge());
		preparedStatement
				.setDate(4, new Date(userInfo.getBirthday().getTime()));
		preparedStatement.setString(5, userInfo.getEmail());
		preparedStatement.setString(6, userInfo.getMobile());
		preparedStatement.setString(7, userInfo.getCreate_user());
		preparedStatement.setString(8, userInfo.getUpdate_user());
		preparedStatement.setInt(9, userInfo.getIsdel());

		preparedStatement.execute();

	}

	public void updateUser(UserInfo userInfo) throws Exception {

		Connection conn = DBUtil.getConnection();
		String sql = "" + " update user_info"
				+ " set user_name=?,sex=?,age=?,birthday=?,email=?,mobile=?,"
				+ " update_user=?,update_date=current_date(),isdel=?"
				+ " where id =?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setString(1, userInfo.getUser_name());
		preparedStatement.setInt(2, userInfo.getSex());
		preparedStatement.setInt(3, userInfo.getAge());
		preparedStatement
				.setDate(4, new Date(userInfo.getBirthday().getTime()));
		preparedStatement.setString(5, userInfo.getEmail());
		preparedStatement.setString(6, userInfo.getMobile());
		preparedStatement.setString(7, userInfo.getUpdate_user());
		preparedStatement.setInt(8, userInfo.getIsdel());
		preparedStatement.setInt(9, userInfo.getId());

		preparedStatement.execute();

	}

	public void deleteUser(Integer id) throws Exception {
		Connection conn = DBUtil.getConnection();
		String sql = "" + " delete from user_info" + " where id =?";

		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
	}

	public List<UserInfo> getUsers() throws Exception {
		Connection conn = DBUtil.getConnection();
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select user_name,age from user_info");
		List<UserInfo> userInfos = new ArrayList<UserInfo>();
		UserInfo userInfo = null;
		while (resultSet.next()) {
			userInfo = new UserInfo();
			userInfo.setUser_name(resultSet.getString("user_name"));
			userInfo.setAge(Integer.valueOf(resultSet.getInt("age")));

			userInfos.add(userInfo);
		}
		return userInfos;
	}

	public UserInfo getUser(Integer id) throws Exception {
		UserInfo user = null;
		Connection conn = DBUtil.getConnection();
		String sql = "" + " select * from user_info" + " where id =?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			user = new UserInfo();
			user.setId(resultSet.getInt("id"));
			user.setUser_name(resultSet.getString("user_name"));
			user.setAge(resultSet.getInt("age"));
			user.setSex(resultSet.getInt("sex"));
			user.setBirthday(resultSet.getDate("birthday"));
			user.setEmail(resultSet.getString("email"));
			user.setMobile(resultSet.getString("mobile"));
			user.setCreate_date(resultSet.getDate("create_date"));
			user.setCreate_user(resultSet.getString("create_user"));
			user.setUpdate_date(resultSet.getDate("update_date"));
			user.setUpdate_user(resultSet.getString("update_user"));

		}
		return user;
	}
}
