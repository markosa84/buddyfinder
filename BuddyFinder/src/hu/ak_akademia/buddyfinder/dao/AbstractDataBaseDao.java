package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;

public abstract class AbstractDataBaseDao<T> implements DataBaseDao<T> {

	protected Connection connection;

	@Override
	public Connection createConnection() {
		return null;
	}

	
	
	
}
