package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.util.List;

import hu.ak_akademia.buddyfinder.dao.sql.SqlBuilder;
import hu.ak_akademia.buddyfinder.dao.sql.SqlReader;
import hu.ak_akademia.buddyfinder.dao.sql.SqlWriter;

public interface DataBaseDao<T> {

    void create(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter);

    void update(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter);

    void delete(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter);

    List<T> read(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter, SqlReader<T> sqlReader);

    T readSingle(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter, SqlReader<T> sqlReader);

    Connection createConnection();

}