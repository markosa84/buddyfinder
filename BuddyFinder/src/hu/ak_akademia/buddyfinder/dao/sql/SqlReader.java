package hu.ak_akademia.buddyfinder.dao.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface SqlReader<T> {
    List<T> read(ResultSet resultSet) throws SQLException;
}
