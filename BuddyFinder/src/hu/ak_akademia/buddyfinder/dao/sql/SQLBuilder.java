package hu.ak_akademia.buddyfinder.dao.sql;

public interface SQLBuilder {
	String selectAllStatement();
	String selectByIdStatement(int id);
	String insertStatement();
	String updateStatement(int id);
	String logicDeleteStatement(int id);
}
