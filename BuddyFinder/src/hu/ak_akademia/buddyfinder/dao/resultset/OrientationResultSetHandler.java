package hu.ak_akademia.buddyfinder.dao.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dto.Orientation;

public class OrientationResultSetHandler implements ResultSetHandler<Orientation> {

	@Override
	public List<Orientation> getListOfDtos(ResultSet rs) throws SQLException {
		List<Orientation> orientation = new ArrayList<>();
		int orientationId = rs.getInt("ORIENTATION_ID");
		String orientationName = rs.getString("ORIENTATION_NAME");
		orientation.add(new Orientation(orientationId, orientationName));
		return orientation;
	}

}
