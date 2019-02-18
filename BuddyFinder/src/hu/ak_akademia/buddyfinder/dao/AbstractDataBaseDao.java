package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import hu.ak_akademia.buddyfinder.dao.sql.SQLBuilder;

public abstract class AbstractDataBaseDao<T> implements DataBaseDao<T> {

	protected SQLBuilder sqlBuilder;

	@Override
	public Connection createConnection() throws SQLException {
		try {
			System.out.println("Connection ...");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "buddyfinder", "admin");
			System.out.println(" ... succes.");
			return connection;
		} catch (SQLException e) {
			System.out.println(" ... failed.");
			throw e;
		}
	}
	
	
	
}
