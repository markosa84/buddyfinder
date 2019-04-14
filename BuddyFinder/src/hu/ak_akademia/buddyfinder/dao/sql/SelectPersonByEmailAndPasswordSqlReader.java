package hu.ak_akademia.buddyfinder.dao.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dto.Person;

public class SelectPersonByEmailAndPasswordSqlReader implements SqlReader<Person> {

    @Override
    public List<Person> read(ResultSet resultSet) throws SQLException {
        List<Person> persons = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("person_id");
            String userName = resultSet.getString("user_name");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");

            Person person = new Person();
            person.setPersonID(id);
            person.setUserName(userName);
            person.setEmail(email);
            person.setPassword(password);

            persons.add(person);
        }
        return persons;
    }

}