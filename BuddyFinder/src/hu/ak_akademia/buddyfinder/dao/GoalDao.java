package hu.ak_akademia.buddyfinder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dao.resultset.GoalResultSetHandler;
import hu.ak_akademia.buddyfinder.dao.sql.GoalSQLBuilder;
import hu.ak_akademia.buddyfinder.dto.Goal;

public class GoalDao extends AbstractDataBaseDao<Goal> {
	
	public GoalDao() throws SQLException {
		sqlBuilder = new GoalSQLBuilder();
	}

	@Override
	public void create(Goal entity) {
		System.out.println("No create in Goal table is allowed!");
	}

	@Override
	public void update(Goal entity) {
		System.out.println("No update in Goal table is allowed!");

	}

	@Override
	public void delete(Goal entity) {
		System.out.println("No delete in Goal table is allowed!");

	}

	@Override
	public List<Goal> read(Goal entity) {
		List<Goal> goal = new ArrayList<>();
		int goalId = entity.getGoalId();
		String sql = sqlBuilder.selectByIdStatement(goalId);
		try (Connection con = createConnection(); PreparedStatement statement = con.prepareStatement(sql)) {
			ResultSet rs = statement.executeQuery();
			goal = new GoalResultSetHandler().getListOfDtos(rs);
		} catch (Exception e) {
			System.out.println("SQL Goal table read failed. Check the goal id or sql connection.");
			System.out.println(e);
		}
		
		return goal;
	}

}
