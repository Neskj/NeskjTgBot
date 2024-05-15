package neskj.NeskjTgBot.MessageHandler.MessageResponser;

public class ResponseStart implements MessageResponser{

    @Override
    public String responseTheMessage(){
        return "Привет! вы выбрали /start";
    }
}
