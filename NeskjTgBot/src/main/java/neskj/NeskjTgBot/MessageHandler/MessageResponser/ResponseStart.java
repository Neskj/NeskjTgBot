package neskj.NeskjTgBot.MessageHandler.MessageResponser;

public class ResponseStart implements MessageResponser{

    @Override
    public String responseTheMessage(){
        return "Реализованные проекты:\n\n*  Погодный сервис /weather" +
                "\n\n*  Метрологический info-сервис по газоанализаторам /drager" +
                "\n\n*  Веб генератор QR пропуска на предприятие /generator\n\n*  Информационный бот /bot";
    }
}
