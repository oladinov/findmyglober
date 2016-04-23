package com.findmyglober.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/findglbr";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "Shurtugal07!";

	static Connection connection;
	private static DataBaseConnection instance = null;

	private DataBaseConnection() {
		performConnection();
	}

	public static DataBaseConnection getInstance() {
		if (instance == null)
			instance = new DataBaseConnection();
		return instance;
	}

	public static void deleteInstance() {
		instance = null;
		closeConnection();
	}

	public void performConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
}
