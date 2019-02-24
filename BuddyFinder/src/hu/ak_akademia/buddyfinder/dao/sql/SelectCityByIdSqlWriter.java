package hu.ak_akademia.buddyfinder.dao.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import hu.ak_akademia.buddyfinder.dto.City;

public class SelectCityByIdSqlWriter implements SqlWriter<City> {

    private final Integer cityId;

    public SelectCityByIdSqlWriter(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public void write(PreparedStatement statement) throws SQLException {
        statement.setInt(1, cityId);
    }

}
