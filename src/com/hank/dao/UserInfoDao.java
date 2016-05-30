package com.hank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hank.db.DBUtil;
import com.hank.modal.UserInfo;
import com.mysql.fabric.xmlrpc.base.Array;

public class UserInfoDao {
	public void addUser() {

	}

	public void updateUser() {

	}

	public void deleteUser() {

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

	public UserInfo getUser() {
		return null;
	}

}
