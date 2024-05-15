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

    private Proxy proxy;

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
        City city=new City();
        city.setCity("Москва");
        ApiResponse api=proxy.getFromApi(city);
        return responser.responseTheMessage()+" "+api.toString();
    }
}
