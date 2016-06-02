package com.hank.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hank.dao.UserInfoDao;
import com.hank.modal.UserInfo;

public class UserInfoAction {
	public static void main(String[] args) throws Exception {

		// new UserInfoAction().addUserTest();
		// new UserInfoAction().updateUserTest();
		// new UserInfoAction().deleteUserTest();
		// new UserInfoAction().getUserTest();
		// new UserInfoAction().showAllUserInfo();
		new UserInfoAction().TestQueryWithChangedParams();

	}

	public void addUserTest() throws Exception {
		UserInfoDao dao = new UserInfoDao();

		UserInfo userInfo = new UserInfo();
		userInfo.setUser_name("KK");
		userInfo.setAge(22);
		userInfo.setSex(1);
		userInfo.setBirthday(new Date());
		userInfo.setEmail("huakang.zhou@qq.com");
		userInfo.setMobile("15168321114");
		userInfo.setCreate_user("Admin");
		userInfo.setUpdate_user("Admin");
		userInfo.setIsdel(1);// 1:no delete 0:delete

		dao.addUser(userInfo);
	}

	public void updateUserTest() throws Exception {
		UserInfoDao dao = new UserInfoDao();

		UserInfo userInfo = new UserInfo();
		userInfo.setUser_name("KK");
		userInfo.setAge(33);
		userInfo.setSex(1);
		userInfo.setBirthday(new Date());
		userInfo.setEmail("huakang.zhou@qq.com");
		userInfo.setMobile("15168321114");
		userInfo.setUpdate_user("Admin");
		userInfo.setUpdate_user("Admin");
		userInfo.setIsdel(1);// 1:no delete 0:delete
		userInfo.setId(4);

		dao.updateUser(userInfo);
	}

	public void deleteUserTest() throws Exception {
		UserInfoDao dao = new UserInfoDao();
		dao.deleteUser(4);
	}

	public void getUserTest() throws Exception {
		UserInfoDao dao = new UserInfoDao();
		UserInfo u = dao.getUser(5);
		System.out.println(u.toString());
	}

	public void showAllUserInfo() throws Exception {
		UserInfoDao dao = new UserInfoDao();
		List<UserInfo> userInfos = dao.getUsers();
		for (UserInfo u : userInfos) {
			System.out.println("name:" + u.getUser_name() + "\nage:"
					+ u.getAge());
		}
	}

	// 测试select * form table_name where +可变的查询条件的方法，这里用到了Map
	public void TestQueryWithChangedParams() throws Exception {

		UserInfoDao dao = new UserInfoDao();
		List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("name", "user_name");
		param.put("relation", "like");
		param.put("value", "'%K%'");// 名字是字符串类型的，所以需要加单引号

		params.add(param);

		param = new HashMap<String, Object>();
		param.put("name", "mobile");
		param.put("relation", "=");
		param.put("value", "'15168321114'");// 名字是字符串类型的，所以需要加单引号

		params.add(param);

		UserInfo userInfo = null;
		List<UserInfo> userInfos = dao.query(params);
		for (int i = 0; i < userInfos.size(); i++) {
			userInfo = userInfos.get(i);
			System.out.println("name:" + userInfo.getUser_name() + " age:"
					+ userInfo.getAge());
		}

	}
}
