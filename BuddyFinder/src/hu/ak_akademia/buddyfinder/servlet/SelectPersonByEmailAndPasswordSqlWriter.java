package hu.ak_akademia.buddyfinder.servlet;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import hu.ak_akademia.buddyfinder.dao.sql.SqlWriter;
import hu.ak_akademia.buddyfinder.dto.Person;

public class SelectPersonByEmailAndPasswordSqlWriter implements SqlWriter<Person> {

    private final Person person;

    public SelectPersonByEmailAndPasswordSqlWriter(Person person) {
        this.person = person;
    }

    @Override
    public void write(PreparedStatement statement) throws SQLException {
        statement.setString(1, person.getEmail());
        statement.setString(2, person.getPassword());
    }

}