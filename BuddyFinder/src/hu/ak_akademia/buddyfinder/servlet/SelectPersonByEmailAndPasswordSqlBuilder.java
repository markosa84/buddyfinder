package hu.ak_akademia.buddyfinder.servlet;

import hu.ak_akademia.buddyfinder.dao.sql.SqlBuilder;

public class SelectPersonByEmailAndPasswordSqlBuilder implements SqlBuilder {

    @Override
    public String build() {
        return "SELECT person_id, user_name, email, password FROM person WHERE email = ? AND password = ?";
    }

}