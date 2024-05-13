package neskj.NeskjTgBot.MessageHandler;

import org.springframework.stereotype.Component;

@Component
public class MessageService implements MessageHandler {


    @Override
    public String processTheMessage(String incomingMessage) {

        switch (incomingMessage) {
            case "/hello":
                return "Hello world im a new Neskj's bot";
            case "/how":
                return "how do you do you do you do";
            default:
                return "Not understand you";
        }
    }
}
