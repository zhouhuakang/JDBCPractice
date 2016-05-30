package com.hank.action;

import java.util.Date;
import java.util.List;

import com.hank.dao.UserInfoDao;
import com.hank.modal.UserInfo;

public class UserInfoAction {
	public static void main(String[] args) throws Exception {

		new UserInfoAction().addUserTest();
		new UserInfoAction().showAllUserInfo();
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

	public void showAllUserInfo() throws Exception {
		UserInfoDao dao = new UserInfoDao();
		List<UserInfo> userInfos = dao.getUsers();
		for (UserInfo u : userInfos) {
			System.out.println("name:" + u.getUser_name() + "\nage:"
					+ u.getAge());
		}
	}
}
