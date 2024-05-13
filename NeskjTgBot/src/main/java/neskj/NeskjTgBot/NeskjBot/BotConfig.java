package neskj.NeskjTgBot.NeskjBot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
public class BotConfig {

    private final NeskjBot neskjBot;

    @Autowired
    public BotConfig(NeskjBot neskjBot){
        this.neskjBot=neskjBot;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void initBot(){

        try {
            TelegramBotsApi telegramBotsApi=new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(neskjBot);
        } catch (TelegramApiException e){
            System.out.println("-->> Exception while try to init bot <<--");
        }


    }
}
