package neskj.NeskjTgBot.MessageHandler;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.*;
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
            case "/weatherApp":
                responser=new ResponseWeatherApp();
                break;
            case "/dragerService":
                responser = new ResponseDragerService();
                break;
            case "/qrGenerator":
                responser = new ResponseQRgenerator();
                break;
            case "/neskjBot":
                responser = new ResponseNeskjBot();
                break;
            default:
                responser = new ResponseDefault();
                break;
        }
        return responser.responseTheMessage();
    }
}
