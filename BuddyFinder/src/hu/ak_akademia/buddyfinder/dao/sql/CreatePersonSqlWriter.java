package hu.ak_akademia.buddyfinder.dao.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import hu.ak_akademia.buddyfinder.dto.Person;
import hu.ak_akademia.buddyfinder.util.PasswordEncrypter;

public class CreatePersonSqlWriter implements SqlWriter<Person> {

    private final Person person;

    public CreatePersonSqlWriter(Person person) {
        this.person = person;
    }

    @Override
    public void write(PreparedStatement statement) throws SQLException {
        int i = 1;
        statement.setString(i++, person.getGender()
                .getSign());
        statement.setString(i++, person.getUserName());
        statement.setString(i++, person.getEmail());
        statement.setString(i++, PasswordEncrypter.getSHA512SecurePassword(person.getPassword(), "thisIsSalt"));
    }

}
