package hu.ak_akademia.buddyfinder.dao.sql;

public class CreatePersonSqlBuilder implements SqlBuilder {

    @Override
    public String build() {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO person ( ");
        sql.append("    person_id, ");
        sql.append("    gender, ");
        sql.append("    user_name, ");
        sql.append("    email, ");
        sql.append("    password ");
        sql.append(") VALUES ( ");
        sql.append("    person_seq.nextval, ");
        sql.append("    ?, ");
        sql.append("    ?, ");
        sql.append("    ?, ");
        sql.append("    ? ");
        sql.append(") ");
        return sql.toString();
    }

}