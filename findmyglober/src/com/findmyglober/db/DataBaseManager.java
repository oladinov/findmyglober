package com.findmyglober.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager {

	private DataBaseConnection dataBaseConnection;

	public DataBaseManager() {
		dataBaseConnection = DataBaseConnection.getInstance();
	}

	public ResultSet executeSelect(String query) throws SQLException {
		Connection conn = dataBaseConnection.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			if (conn != null)
				conn.close();
			if (statement != null)
				statement.close();
			e.printStackTrace();
		}
		return resultSet;
	}

	public int executeInsert(String query) throws SQLException {
		Connection conn = dataBaseConnection.getConnection();
		Statement statement = null;
		int result = 0;

		try {
			statement = conn.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			if (conn != null)
				conn.close();
			if (statement != null)
				statement.close();
			e.printStackTrace();
		}
		return result;
	}
}
