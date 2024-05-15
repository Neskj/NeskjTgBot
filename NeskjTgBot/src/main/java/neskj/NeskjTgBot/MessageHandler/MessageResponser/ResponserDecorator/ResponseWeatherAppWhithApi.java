package neskj.NeskjTgBot.MessageHandler.MessageResponser.ResponserDecorator;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.MessageResponser;
import neskj.NeskjTgBot.Model.ApiResponse;
import neskj.NeskjTgBot.Model.City;
import neskj.NeskjTgBot.Proxy.Proxy;

public class ResponseWeatherAppWhithApi extends ResponserDecorator{

    private final Proxy proxy;

    public ResponseWeatherAppWhithApi(Proxy proxy, MessageResponser messageResponser) {
        super(messageResponser);
        this.proxy=proxy;
    }

    public String addApi(){
        City city =new City();
        city.setCity("Москва");
        ApiResponse api=proxy.getFromApi(city);
        return api.toString();
    }

    @Override
    public String responseTheMessage(){

        return super.responseTheMessage()+"\n"+addApi();
    }
}
