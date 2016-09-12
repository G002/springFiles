package com.proj;

/**
 * Created by geethakalluri on 9/11/16.
 */
public class springbean {

    private String message;

    public void setMessage(String message)
    {
        this.message = message;

    }

    public void getMessage()
    {
        System.out.println("Your message .. "+ message);
    }

}
