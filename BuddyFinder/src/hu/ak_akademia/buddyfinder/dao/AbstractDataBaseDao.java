package hu.ak_akademia.buddyfinder.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import hu.ak_akademia.buddyfinder.dao.sql.SQLBuilder;

public abstract class AbstractDataBaseDao<T> implements DataBaseDao<T> {

	protected SQLBuilder sqlBuilder;

	@Override
	public Connection createConnection() throws SQLException {
		try {
			Properties p = new Properties();
			p.load(new FileInputStream("res/bf.properties"));
			System.out.println("Connection ...");
			Connection connection = DriverManager.getConnection(p.getProperty("url"),
					p.getProperty("name"), p.getProperty("password"));
			System.out.println(" ... success.");
			return connection;
		} catch (SQLException e) {
			System.out.println(" ... failed.");
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
