package hu.ak_akademia.buddyfinder.dao.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dto.Gender;
import hu.ak_akademia.buddyfinder.dto.Person;
import hu.ak_akademia.buddyfinder.dto.Status;

public class PersonResultSetHandler implements ResultSetHandler<Person> {

	@Override
	public List<Person> getListOfDtos(ResultSet rs) throws SQLException {
		List<Person> persons = new ArrayList<>();
		while(rs.next()) {
			
			int personID = rs.getInt("PERSON_ID");
			Gender gender = rs.getInt("GENDER")=='M' ? Gender.MALE : Gender.FEMALE;
			String userName = rs.getString("USER_NAME");
			String email = rs.getString("EMAIL");
			String password= rs.getString("PASSWORD");
			java.sql.Date dob = rs.getDate("DATE_OF_BIRTH");
			LocalDate dateOfBirth = LocalDate.of(dob.getYear() + 1900,
												dob.getMonth() + 1,
												dob.getDay());
			
			int orientationID = rs.getInt("ORIENTATION_ID");
			Timestamp lastOnline = rs.getTimestamp("LAST_ONLINE");
			boolean isSmoker = rs.getInt("SMOKER")=='Y' ? true : false;
			Status status = rs.getInt("STATUS")=='A' ? Status.ACTIVE : Status.DELETED;
			int cityID = rs.getInt("CITY_ID");
			String introduction = rs.getString("INTRODUCTION");
			persons.add(new Person(
								personID,
								gender,
								userName,
								email,
								password,
								dateOfBirth,
								orientationID,
								lastOnline,
								isSmoker,
								status,
								cityID,
								introduction
									)
						);
		}
		return persons;
	}

}
