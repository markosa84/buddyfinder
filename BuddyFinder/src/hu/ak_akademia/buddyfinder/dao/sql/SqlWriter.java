package hu.ak_akademia.buddyfinder.dao.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface SqlWriter<T> {
    void write(PreparedStatement statement) throws SQLException;
}
