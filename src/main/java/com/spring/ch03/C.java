package com.spring.ch03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

/**
 * Created by geethakalluri on 9/14/16.
 */
@Component
public class C {

    @Autowired
    private A a;

    public void checkBAlive() {a.checkBAlive();}

    @PostConstruct
    public void init() {
        Assert.notNull(a); }

}
