package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.util.List;

public interface DataBaseDao<T> {

	void create(T entity);

	void update(T entity);

	void delete(T entity);

	List<T> read(T entity);

	Connection createConnection() throws Throwable;
}
