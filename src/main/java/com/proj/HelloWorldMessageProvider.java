package com.proj;

/**
 * Created by geethakalluri on 9/11/16.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage(){
        return "Hello Spring Nice to see you";

    }
}
