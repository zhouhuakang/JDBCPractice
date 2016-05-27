package com.hank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/jdbc_practice";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// Step1
		Class.forName("com.mysql.jdbc.Driver");
		// Step2
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		// Step3
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select user_name,age from user_info");
		while (resultSet.next()) {
			System.out.println(resultSet.getString("user_name") + ","
					+ resultSet.getString("age"));

		}
	}

}
