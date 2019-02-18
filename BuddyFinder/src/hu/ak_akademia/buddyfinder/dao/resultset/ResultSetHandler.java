package hu.ak_akademia.buddyfinder.dao.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ResultSetHandler<T> {
	public List<T> getListOfDtos(ResultSet rs) throws SQLException;
}
