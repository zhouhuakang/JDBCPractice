package com.hank.action;

import java.util.List;

import com.hank.dao.UserInfoDao;
import com.hank.modal.UserInfo;

public class UserInfoAction {
	public static void main(String[] args) throws Exception {
		UserInfoDao dao = new UserInfoDao();
		List<UserInfo> userInfos = dao.getUsers();
		for (UserInfo userInfo : userInfos) {
			System.out.println("name:" + userInfo.getUser_name() + "\nage:"
					+ userInfo.getAge());
		}
	}

}
