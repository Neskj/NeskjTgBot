package neskj.NeskjTgBot.MessageHandler.MessageResponser;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class ResponseStart implements MessageResponser{

    @Override
    public String responseTheMessage(){
        return "Привет! вы выбрали /start";
    }
}
