package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dao.resultset.CityResultSetHandler;
import hu.ak_akademia.buddyfinder.dto.City;

public class CityDao extends AbstractDataBaseDao<City> {

    @Override
    public void create(City entity) {
        throw new UnsupportedOperationException("Nem megengedett művelet.");
    }

    @Override
    public void update(City entity) {
        throw new UnsupportedOperationException("Nem megengedett művelet.");
    }

    @Override
    public void delete(City entity) {
        throw new UnsupportedOperationException("Nem megengedett művelet.");
    }

    @Override
    public List<City> read(City entity) {
        List<City> cities = new ArrayList<>();
        int cityId = entity.getCityId();
        String sql = sqlBuilder.selectByIdStatement(cityId);
        try (Connection connection = createConnection(); PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
            cities = new CityResultSetHandler().getListOfDtos(resultSet);
        } catch (SQLException e) {
            throw new IllegalStateException("Nem sikerült lekérdezni a városok listáját az adatbázisból.", e);
        }
        return cities;
    }

}