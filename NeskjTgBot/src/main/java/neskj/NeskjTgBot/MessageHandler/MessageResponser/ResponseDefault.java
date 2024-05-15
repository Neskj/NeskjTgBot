package neskj.NeskjTgBot.MessageHandler.MessageResponser;

public class ResponseDefault implements MessageResponser{

    @Override
    public String responseTheMessage() {
        return "Не понятен запрос. Введтите : \n\n* /weather - для перехода к погодному сервису," +
                " \n* /drager - проверить базу по газоанализаторам, \n* /generator - сгенерировать QR код для прохода на территорию ЦТД, " +
                "\n* /bot - информация об этом боте \n\nили воспользуйтесь кнопкой меню";
    }
}
