package hu.ak_akademia.buddyfinder.dao.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dto.City;

public class SelectCityByIdSqlReader implements SqlReader<City> {

    @Override
    public List<City> read(ResultSet resultSet) throws SQLException {
        List<City> cities = new ArrayList<>();
        while(resultSet.next()) {
            int id = resultSet.getInt("city_id");
            String name = resultSet.getString("city_name");
            cities.add(new City(id,name));
        }
        return cities;
    }

}
