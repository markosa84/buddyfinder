package hu.ak_akademia.buddyfinder.dao.sql;

@Deprecated
public abstract class AbstractSQLBuilder implements SqlBuilder {
	protected StringBuilder sb = new StringBuilder();
	
	protected void clearStringBuilderRepository() {
		int length = sb.length();
		sb.delete(0, length);
	}
}
