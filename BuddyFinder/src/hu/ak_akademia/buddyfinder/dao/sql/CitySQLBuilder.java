package hu.ak_akademia.buddyfinder.dao.sql;

public class CitySQLBuilder extends AbstractSQLBuilder {

	@Override
	public String selectAllStatement() {
		clearStringBuilderRepository();
		sb.append("SELECT        ");
		sb.append(" *            ");
		sb.append(" FROM         ");
		sb.append(" city         ");
		sb.append(" ;");
		return sb.toString();
	}

	@Override
	public String selectByIdStatement(int id) {
		clearStringBuilderRepository();
		sb.append("SELECT        ");
		sb.append(" *            ");
		sb.append(" FROM         ");
		sb.append(" city         ");
		sb.append(" WHERE        ");
		sb.append(" city_id=     ");
		sb.append(id);
		sb.append(" ;");
		return sb.toString();
	}

	@Override
	public String insertStatement() {
		System.out.println("Not allowed");
		return null;
	}

	@Override
	public String updateStatement(int id) {
		clearStringBuilderRepository();
		sb.append("UPDATE city SET      ");
		sb.append("    city_name= ?,    ");
		sb.append(" WHERE               ");
		sb.append("    city_id =        ");
		sb.append(id);
		sb.append(" ; ");
		return sb.toString();
	}

	@Override
	public String logicDeleteStatement(int id) {
		System.out.println("Not allowed");
		return null;
	}

}
