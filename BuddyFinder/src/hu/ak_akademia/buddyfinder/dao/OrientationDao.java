package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dao.resultset.OrientationResultSetHandler;
import hu.ak_akademia.buddyfinder.dto.Orientation;

public class OrientationDao extends AbstractDataBaseDao<Orientation>{

	@Override
	public void create(Orientation entity) {
	}

	@Override
	public void update(Orientation entity) {
	}

	@Override
	public void delete(Orientation entity) {
	}

	@Override
	public List<Orientation> read(Orientation entity) {
		List<Orientation> orientationList = new ArrayList<>();
		int orientationId = entity.getOrientationId();
		String sql = sqlBuilder.selectByIdStatement(orientationId);
		try (Connection con = createConnection(); PreparedStatement statement = con.prepareStatement(sql)) {
			ResultSet rs = statement.executeQuery();
			orientationList = new OrientationResultSetHandler().getListOfDtos(rs);
		} catch (Exception e) {
			System.out.println("SQL Orientation table read failed. Check the Orientation id or sql connection.");
			System.out.println(e);
		}
		return orientationList;
	}



}
