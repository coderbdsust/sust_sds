package edu.sust.sust_sd.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

/**
 * 
 * @author Biswajit Debnath https://community.oracle.com/docs/DOC-918906
 */
public class DbConnection {
	public static String DB_HOST;
	public static String DB_PORT;
	public static String DB_USERNAME;
	public static String DB_PASSWORD;
	public static String DB_DRIVER;
	private static Connection connection;

	private DbConnection() {
		DB_DRIVER = "com.mysql.jdbc.Driver";
		DB_HOST = "jdbc:mysql://localhost";
		DB_PORT = "3306";
		DB_USERNAME = "sust";
		DB_PASSWORD = "sust";
		String DB_SCHEMA = "sust_sd";
		connection = setConnection(DB_SCHEMA);
	}

	private DbConnection(String dbSchema) {
		DB_DRIVER = "com.mysql.jdbc.Driver";
		DB_HOST = "jdbc:mysql://localhost";
		DB_PORT = "3306";
		DB_USERNAME = "sust";
		DB_PASSWORD = "sust";
		connection = setConnection(dbSchema);
	}

	private static Connection setConnection() {
		try {
			Class.forName(DB_DRIVER);
			String DATABASE_URL = DB_HOST + ":" + DB_PORT + "/";
			Connection conn = DriverManager.getConnection(DATABASE_URL,
					DB_USERNAME, DB_PASSWORD);
			System.out.println("DATABASE CONNECTED!");
			return (Connection)conn;
		} catch (Exception ex) {
			System.out
					.println("DATABASE CONNECTION'S STATEMENT CREATION ERROR!");
		}
		return null;
	}

	private static Connection setConnection(String DATABASE_SCHEMA) {
		try {
			Class.forName(DB_DRIVER);
			String DATABASE_URL = DB_HOST + ":" + DB_PORT + "/"
					+ DATABASE_SCHEMA;
			Connection conn = DriverManager.getConnection(DATABASE_URL,
					DB_USERNAME, DB_PASSWORD);
			System.out.println("DATABASE CONNECTED!");
			return (Connection)conn;
		} catch (Exception ex) {
			System.out
					.println("DATABASE CONNECTION'S STATEMENT CREATION ERROR!");
		}
		return null;
	}

	private static class DbConnectionManagerHolder {
		private final static DbConnection instance = new DbConnection();
	}

	public static DbConnection getInstance() {
		try {
			return DbConnectionManagerHolder.instance;
		} catch (ExceptionInInitializerError ex) {
			System.out.println("DATABASE CONNECTION INITIALIZE ERROR!");
		}
		return null;
	}

	public static Connection getConnection() {
		return (Connection)connection;
	}

}
