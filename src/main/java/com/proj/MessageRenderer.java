package com.proj;

/**
 * Created by geethakalluri on 9/11/16.
 */
public interface MessageRenderer {

    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();

}
