package com.spring.ch03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by geethakalluri on 9/14/16.
 */
@Configuration
public class SpringAnnotate {



    @Bean
    public B b() { return new B();}

    @Bean
    public A a() {
        A a = new A();
        a.setB(b());
        return a;
    }

}
