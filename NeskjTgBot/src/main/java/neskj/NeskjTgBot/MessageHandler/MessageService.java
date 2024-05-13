package neskj.NeskjTgBot.MessageHandler;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService implements MessageHandler {

    private MessageResponser responser;

    @Override
    public String processTheMessage(String incomingMessage) {

        switch (incomingMessage) {
            case "/start":
                responser = new ResponseStart();
                return responser.responseTheMessage();
            case "/weatherApp":
                responser=new ResponseWeatherApp();
                return responser.responseTheMessage();
            case "/dragerService":
                responser=new ResponseDragerService();
                return responser.responseTheMessage();
            case "/qrGenerator":
                responser=new ResponseQRgenerator();
                return responser.responseTheMessage();
            case "/neskjBot":
                responser=new ResponseNeskjBot();
                return responser.responseTheMessage();
            default:
                responser=new ResponseDefault();
                return responser.responseTheMessage();
        }
    }
}
