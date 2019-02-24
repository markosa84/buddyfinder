package hu.ak_akademia.buddyfinder.dao.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dto.City;

public class CityResultSetHandler implements ResultSetHandler<City>{

	@Override
	public List<City> getListOfDtos(ResultSet rs) throws SQLException {
		List<City> city = new ArrayList<>();
		int cityId = rs.getInt("CITY_ID");
		String cityName = rs.getString("CITY_NAME");
		city.add(new City(cityId, cityName));
		return city;
	}

}
