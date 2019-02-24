package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dao.resultset.CityResultSetHandler;
import hu.ak_akademia.buddyfinder.dto.City;

public class CityDao extends AbstractDataBaseDao<City>{

	@Override
	public void create(City entity) {
	}

	@Override
	public void update(City entity) {
	}

	@Override
	public void delete(City entity) {
	}

	@Override
	public List<City> read(City entity) {
		List<City> citys = new ArrayList<>();
		int cityId = entity.getCityId();
		String sql = sqlBuilder.selectByIdStatement(cityId);
		try (Connection con = createConnection(); PreparedStatement statement = con.prepareStatement(sql)) {
			ResultSet rs = statement.executeQuery();
			citys = new CityResultSetHandler().getListOfDtos(rs);
		} catch (Exception e) {
			System.out.println("SQL CITY table read failed. Check the CITY id or sql connection.");
			System.out.println(e);
		}
		return citys;
	}

}
