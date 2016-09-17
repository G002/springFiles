package com.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by geethakalluri on 9/16/16.
 */
public class PersonService extends JdbcDaoSupport {

    public String getPerson(Long id) {

        String SQL = "select first_name as firstName from person where id =" + id;

        String person = getJdbcTemplate().queryForObject(SQL, String.class);
        return person;
    }
}
