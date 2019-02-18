package hu.ak_akademia.buddyfinder.dao.sql;

public abstract class AbstractSQLBuilder implements SQLBuilder {
	protected StringBuilder sb = new StringBuilder();
	
	protected void clearStringBuilderRepository() {
		int length = sb.length();
		sb.delete(0, length);
	}
}
