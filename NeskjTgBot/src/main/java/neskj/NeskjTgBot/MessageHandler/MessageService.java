package neskj.NeskjTgBot.MessageHandler;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.*;
import neskj.NeskjTgBot.MessageHandler.MessageResponser.ResponserDecorator.ResponseWeatherAppWhithApi;
import org.springframework.stereotype.Component;

@Component
public class MessageService implements MessageHandler {

    private MessageResponser responser;

    @Override
    public String processTheMessage(String incomingMessage) {

        switch (incomingMessage) {
            case "/start":
                responser = new ResponseStart();
                break;
            case "/weather":
                responser=new ResponseWeatherAppWhithApi(new ResponseWeatherApp());  //завернул в декоратор чтоб добавить feign client
                break;
            case "/drager":
                responser = new ResponseDragerService();
                break;
            case "/generator":
                responser = new ResponseQRgenerator();
                break;
            case "/bot":
                responser = new ResponseNeskjBot();
                break;
            default:
                responser = new ResponseDefault();
                break;
        }
        return responser.responseTheMessage();
    }
}
