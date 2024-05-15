package neskj.NeskjTgBot.MessageHandler;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.*;
import neskj.NeskjTgBot.MessageHandler.MessageResponser.ResponserDecorator.ResponseWeatherAppWhithApi;
import neskj.NeskjTgBot.Model.ApiResponse;
import neskj.NeskjTgBot.Model.City;
import neskj.NeskjTgBot.Proxy.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService implements MessageHandler {

    private MessageResponser responser;

    private Proxy proxy;  // Не корректно с точки зрения архитектуры потому что MessageService не нужен этот интерфейс
                          // но при внедрении бина в ResponseWeatherAppWhithApi он null. Почему ?
    @Autowired
    public MessageService(Proxy proxy){

        this.proxy=proxy;
    }

    @Override
    public String processTheMessage(String incomingMessage) {

        switch (incomingMessage) {
            case "/start":
                responser = new ResponseStart();
                break;
            case "/weather":
                responser=new ResponseWeatherAppWhithApi(proxy,new ResponseWeatherApp());  //завернул в декоратор чтоб добавить feign client
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
