package com.proj.jdbc;

import com.jdbc.Person;
import com.jdbc.PersonNamedParameterService;
import com.jdbc.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by geethakalluri on 9/16/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-jdbc.xml"})
public class springJdbcTest {

    @Autowired
    private PersonService personService;

    @Test
    public void getById(){
        String name = personService.getPerson(1L);
        System.out.println(name);


    }




}


