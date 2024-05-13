package neskj.NeskjTgBot.NeskjBot;

import neskj.NeskjTgBot.MessageHandler.MessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class NeskjBot extends TelegramLongPollingBot {

    @Value("${bot.name}")
    private String botName;
    @Value("${bot.token}")
    private String botToken;

    private final MessageHandler messageHandler;

    @Autowired
    public NeskjBot(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage()&&update.getMessage().hasText()) {
            String incomingMessage=update.getMessage().getText();
            long chatID=update.getMessage().getChatId();

            sendMessage(chatID, messageHandler.processTheMessage(incomingMessage));
        }
    }

    private void sendMessage(long chatId,String text){

        SendMessage responseMessage=new SendMessage();
        responseMessage.setChatId(chatId);
        responseMessage.setText(text);

        try{
            execute(responseMessage);
        }catch (TelegramApiException e){
            System.out.println("-->> Exception while try to send response to user message <<--");
        }finally {
            System.out.println("-->> I send a new message: "+responseMessage+"<<--");
        }
    }
}
