package hu.ak_akademia.buddyfinder.dao.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.buddyfinder.dto.Goal;

public class GoalResultSetHandler implements ResultSetHandler<Goal> {

	@Override
	public List<Goal> getListOfDtos(ResultSet rs) throws SQLException {
		List<Goal> goal = new ArrayList<>();
		int goalId = rs.getInt("GOAL_ID");
		String name = rs.getString("NAME");
		goal.add(new Goal(goalId, name));
		return goal;
	}

}
