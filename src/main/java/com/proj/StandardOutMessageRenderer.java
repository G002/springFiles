package com.proj;

/**
 * Created by geethakalluri on 9/11/16.
 */
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {

        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of Class" + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());

    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider(){
        return this.messageProvider;

        }


}
