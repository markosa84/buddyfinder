package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import hu.ak_akademia.buddyfinder.dao.sql.SqlBuilder;
import hu.ak_akademia.buddyfinder.dao.sql.SqlReader;
import hu.ak_akademia.buddyfinder.dao.sql.SqlWriter;

public abstract class AbstractDataBaseDao<T> implements DataBaseDao<T> {

    protected SqlBuilder sqlBuilder;

    @Override
    public Connection createConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.print("Csatlakozás az adatbázishoz...");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "buddyfinder", "admin");
            System.out.println("sikeres.");
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("sikertelen.");
            throw new IllegalStateException("Nem sikerült csatlakozni az adatbázishoz.", e);
        }
    }

    @Override
    public void create(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter) {
        String sql = sqlBuilder.build();
        try (Connection connection = createConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            sqlWriter.write(statement);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException("Az új rekord rögzítése sikertelen.", e);
        }
    }

    @Override
    public List<T> read(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter, SqlReader<T> sqlReader) {
        String sql = sqlBuilder.build();
        try (Connection connection = createConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            sqlWriter.write(statement);
            try (ResultSet resultSet = statement.executeQuery();) {
                return sqlReader.read(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException("A lekérdezés sikertelen.", e);
        }
    }

    @Override
    public T readSingle(SqlBuilder sqlBuilder, SqlWriter<T> sqlWriter, SqlReader<T> sqlReader) {
        List<T> result = read(sqlBuilder, sqlWriter, sqlReader);
        return result.isEmpty() ? null : result.get(0);
    }

}