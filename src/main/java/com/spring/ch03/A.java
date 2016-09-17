package com.spring.ch03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by geethakalluri on 9/14/16.
 */
@Component
public class A {

    private B b;

    @Autowired
    public void setB(B b) { this.b =b;
    System.out.println("values from B method are "+ b.var);
    }

    public void checkBAlive() { System.out.println("CheckBAlive");}

    public void CheckViaC() { System.out.println("C");}

}
