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
    public Connection createConnection() {
        try {
            Properties dbProperties = new Properties();
            dbProperties.load(new FileInputStream("res/buddyfinder-db.properties"));
            System.out.print("Csatlakozás az adatbázishoz...");
            Connection connection = DriverManager.getConnection(dbProperties.getProperty("url"), dbProperties.getProperty("name"), dbProperties.getProperty("password"));
            System.out.println("sikeres.");
            return connection;
        } catch (SQLException e) {
            System.out.println("sikertelen.");
            throw new IllegalStateException("Nem sikerült csatlakozni az adatbázishoz.", e);
        } catch (IOException e) {
            System.out.println("sikertelen.");
            throw new IllegalStateException("Nem sikerült csatlakozni az adatbázishoz, mert nem található az adatbázis beállításait tartalmazó fájl.", e);
        }
    }

}