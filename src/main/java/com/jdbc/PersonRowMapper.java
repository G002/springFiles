package com.jdbc;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by geethakalluri on 9/16/16.
 */
public class PersonRowMapper implements RowMapper<Person> {

    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person p = new Person();
        p.setFirstName(rs.getString("firstName"));
        p.setId(rs.getLong("id"));

        return p;
    }
}
