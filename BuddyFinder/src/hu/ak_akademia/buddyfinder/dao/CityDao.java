package hu.ak_akademia.buddyfinder.dao;

import hu.ak_akademia.buddyfinder.dao.sql.SqlBuilder;
import hu.ak_akademia.buddyfinder.dao.sql.SqlWriter;
import hu.ak_akademia.buddyfinder.dto.City;

public class CityDao extends AbstractDataBaseDao<City> {

    @Override
    public void update(SqlBuilder sqlBuilder, SqlWriter<City> sqlWriter) {
        throw new UnsupportedOperationException("Még nincs megvalósítva.");
    }

    @Override
    public void delete(SqlBuilder sqlBuilder, SqlWriter<City> sqlWriter) {
        throw new UnsupportedOperationException("Még nincs megvalósítva.");
    }

}