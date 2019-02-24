package hu.ak_akademia.buddyfinder.dao.sql;

public class SelectCityByIdSqlBuilder implements SqlBuilder {

    @Override
    public String build() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    city_id, ");
        sql.append("    city_name ");
        sql.append("FROM ");
        sql.append("    city ");
        sql.append("WHERE ");
        sql.append("    city_id = ? ");
        return sql.toString();
    }

}
