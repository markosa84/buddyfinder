package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dao.resultset.PersonResultSetHandler;
import hu.ak_akademia.buddyfinder.dao.sql.PersonSQLBuilder;
import hu.ak_akademia.buddyfinder.dto.Person;

public class PersonDao extends AbstractDataBaseDao<Person> {
	
	public PersonDao() throws SQLException {
		sqlBuilder = new PersonSQLBuilder();
	}
	
	@Override
	public void create(Person entity) {
		System.out.println("Create person ...");
		String sql = sqlBuilder.insertStatement();
		try(Connection con = createConnection();
			PreparedStatement statement = con.prepareStatement(sql)
			) {
			statement.setString(1, "" + entity.getGender().getSign());
			statement.setString(2, entity.getUserName());
			statement.setString(3, entity.getEmail());
			statement.setDate(4, new Date(entity.getDateOfBirth().getYear(),
											entity.getDateOfBirth().getMonthValue(),
											entity.getDateOfBirth().getDayOfMonth()));
			statement.setInt(5, entity.getOrientationId());
			statement.setTimestamp(6, entity.getLastOnline());
			statement.setString(7, entity.getSmoker() ? "Y" : "N");
			statement.setString(8, "" + entity.getStatus().getSign());
			statement.setInt(9, entity.getCityId());
			statement.setString(10, entity.getIntroduction());
			statement.execute();
			System.out.println("... succes");
		} catch (SQLException e) {
			System.out.println("... failed");
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Person entity) {
		System.out.println("Update person ...");
		String sql = sqlBuilder.updateStatement(entity.getPersonID());
		try(Connection con = createConnection();
			PreparedStatement statement = con.prepareStatement(sql)
			) {
			statement.setString(1, "" + entity.getGender().getSign());
			statement.setString(2, entity.getUserName());
			statement.setString(3, entity.getEmail());
			statement.setDate(4, new Date(entity.getDateOfBirth().getYear(),
											entity.getDateOfBirth().getMonthValue(),
											entity.getDateOfBirth().getDayOfMonth()));
			statement.setInt(5, entity.getOrientationId());
			statement.setTimestamp(6, entity.getLastOnline());
			statement.setString(7, entity.getSmoker() ? "Y" : "N");
			statement.setString(8, "" + entity.getStatus().getSign());
			statement.setInt(9, entity.getCityId());
			statement.setString(10, entity.getIntroduction());
			statement.executeUpdate();
			System.out.println("... succes");
		} catch (SQLException e) {
			System.out.println("... failed");
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Person entity) {
		System.out.println("Delete person ...");
		int personID = entity.getPersonID();
		String sql = sqlBuilder.logicDeleteStatement(personID);
		try(Connection con = createConnection();
			PreparedStatement statement = con.prepareStatement(sql)) {
			statement.executeUpdate();
			System.out.println("... succes");
		} catch (SQLException e) {
			System.out.println("... failed");
			e.printStackTrace();
		}
	}

	@Override
	public List<Person> read(Person entity) {
		int personID = entity.getPersonID();
		String sql = sqlBuilder.selectByIdStatement(personID);
		List<Person> persons = new ArrayList<>();
		try(Connection con = createConnection();
			PreparedStatement statement = con.prepareStatement(sql);
				) {
			ResultSet rs = statement.executeQuery();
			persons = new PersonResultSetHandler().getListOfDtos(rs);
		} catch (SQLException e) {
			System.out.println("... failed");
			e.printStackTrace();
		}
		return persons;
	}

}