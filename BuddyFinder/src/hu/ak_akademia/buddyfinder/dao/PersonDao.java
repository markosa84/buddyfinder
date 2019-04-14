package hu.ak_akademia.buddyfinder.dao;

import hu.ak_akademia.buddyfinder.dao.sql.SqlBuilder;
import hu.ak_akademia.buddyfinder.dao.sql.SqlWriter;
import hu.ak_akademia.buddyfinder.dto.Person;

public class PersonDao extends AbstractDataBaseDao<Person> {

    @Override
    public void update(SqlBuilder sqlBuilder, SqlWriter<Person> sqlWriter) {
        throw new UnsupportedOperationException("Még nincs megvalósítva.");
    }

    @Override
    public void delete(SqlBuilder sqlBuilder, SqlWriter<Person> sqlWriter) {
        throw new UnsupportedOperationException("Még nincs megvalósítva.");
    }

}