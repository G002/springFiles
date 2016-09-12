package com.proj;

/**
 * Created by geethakalluri on 9/11/16.
 */
public class HelloWorldDecoupled {

    public static void main(String[] args){
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
