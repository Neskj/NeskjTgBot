package neskj.NeskjTgBot.MessageHandler.MessageResponser.ResponserDecorator;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.MessageResponser;

public class ResponseWeatherAppWhithApi extends ResponserDecorator{

    public ResponseWeatherAppWhithApi(MessageResponser messageResponser) {
        super(messageResponser);
    }

    public String addApi(){

        return "+add API";
    }

    public String responseTheMessage(){

        return super.responseTheMessage()+addApi();
    }
}
