package hu.ak_akademia.buddyfinder.dao.sql;

public class PersonSQLBuilder extends AbstractSQLBuilder {

	@Override
	public String selectAllStatement() {
		clearStringBuilderRepository();
		sb.append("SELECT          ");
		sb.append(" *              ");
	    sb.append(" FROM           ");
	    sb.append(" person         ");
	    sb.append(" ;");
		return sb.toString();
	}

	@Override
	public String selectByIdStatement(int id) {
		clearStringBuilderRepository();
		sb.append("SELECT          ");
		sb.append(" *              ");
	    sb.append(" FROM           ");
	    sb.append(" person         ");
	    sb.append(" WHERE          ");
	    sb.append(" person_id=     ");
	    sb.append(id);
	    sb.append(" ;");
		return sb.toString();
	}

	@Override
	public String insertStatement() {
		clearStringBuilderRepository();
		sb.append("INSERT INTO person ( ");
        sb.append("    person_id, ");
        sb.append("    gender, ");
        sb.append("    user_name, ");
        sb.append("    email, ");
        sb.append("    date_of_birth, ");
        sb.append("    orientation_id, ");
        sb.append("    last_online, ");
        sb.append("    smoker, ");
        sb.append("    status, ");
        sb.append("    city_id, ");
        sb.append("    introduction ) ");
        sb.append(" VALUES ( ");
	    sb.append("    person_seq.nextval, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ?, ");
	    sb.append("    ? ");
	    sb.append("    ) ");
	    sb.append(" ; ");
		return sb.toString();
	}

	@Override
	public String updateStatement(int id) {
		clearStringBuilderRepository();
		sb.append("UPDATE person SET      ");
        sb.append("    person_id = ?,     ");
        sb.append("    gender= ?,         ");
        sb.append("    user_name= ?,      ");
        sb.append("    email= ?,          ");
        sb.append("    date_of_birth= ?,  ");
        sb.append("    orientation_id= ?, ");
        sb.append("    last_online= ?,    ");
        sb.append("    smoker= ?,         ");
        sb.append("    status= ?,         ");
        sb.append("    city_id= ?,        ");
        sb.append("    introduction= ?    ");
        sb.append(" WHERE                 ");
        sb.append("    person_id =        ");
        sb.append(id);
	    sb.append(" ; ");
		return sb.toString();
	}

	@Override
	public String logicDeleteStatement(int id) {
		clearStringBuilderRepository();
		sb.append("UPDATE person SET  ");
		sb.append("    status =       ");
		sb.append("    'D'            ");
		sb.append(" WHERE             ");
	    sb.append("    person_id =    ");
	    sb.append(id);
		sb.append(" ; ");
		return sb.toString();
	}
	
}
