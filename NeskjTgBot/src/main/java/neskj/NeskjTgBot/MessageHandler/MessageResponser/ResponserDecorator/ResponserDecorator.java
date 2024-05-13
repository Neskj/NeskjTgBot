package neskj.NeskjTgBot.MessageHandler.MessageResponser.ResponserDecorator;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.MessageResponser;

public class ResponserDecorator implements MessageResponser {

    private final MessageResponser messageResponser;

    public ResponserDecorator(MessageResponser messageResponser){
        this.messageResponser=messageResponser;
    }

    @Override
    public String responseTheMessage() {

        return messageResponser.responseTheMessage();
    }
}
