package hu.ak_akademia.buddyfinder.dao.sql;

public class GoalSQLBuilder extends AbstractSQLBuilder {

	@Override
	public String selectAllStatement() {
		clearStringBuilderRepository();
		sb.append("SELECT          ");
		sb.append(" *              ");
	    sb.append(" FROM           ");
	    sb.append(" goal         ");
	    sb.append(" ;");
		return sb.toString();
	}

	@Override
	public String selectByIdStatement(int id) {
		clearStringBuilderRepository();
		sb.append("SELECT          ");
		sb.append(" *              ");
	    sb.append(" FROM           ");
	    sb.append(" goal         ");
	    sb.append(" WHERE          ");
	    sb.append(" goal_id=     ");
	    sb.append(id);
	    sb.append(" ;");
		return sb.toString();
	}

	@Override
	public String insertStatement() {
		return null; // no insert into goal table is allowed
	}

	@Override
	public String updateStatement(int id) {
		return null; // no update in goal table is allowed
	}

	@Override
	public String logicDeleteStatement(int id) {
		return null; // no delete from goal table is allowed
	}

}
