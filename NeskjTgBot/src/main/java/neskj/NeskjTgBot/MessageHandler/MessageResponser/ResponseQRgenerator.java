package neskj.NeskjTgBot.MessageHandler.MessageResponser;

public class ResponseQRgenerator implements MessageResponser{

    @Override
    public String responseTheMessage() {
        return "Веб генератор QR кода для прохода на предприятие.\n\nАдрес: http://185.198.152.105:9099/getcode \n\nГитХаб: https://github.com/Neskj/QRgenerator \n\n"+
                "Данный сервис позволяет генерировать одноразовые QR пропуска для посещения сотрудниками подрядных организаций. Приложение не использует API для получения кодировки от сторонних сервисов, а самостоятельно решает эту задачу на стороне бэкэнда. В дальнейшем планируется добавление RESTfull API для интеграции с мессенджерами.\n\n"+
                "Использованы технологии: \nJava 21, Spring Boot, библиотека zxing, фронтэнд: HTML+CSS+Thymeleaf ";
    }
}
