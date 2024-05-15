package neskj.NeskjTgBot.MessageHandler.MessageResponser;

public class ResponseWeatherApp implements MessageResponser{

    @Override
    public String responseTheMessage() {
        return "Погодный сервис.\n\nАдрес: http://185.198.152.105:8086/weather \n\nГитХаб: https://github.com/Neskj/ProjectWeatherApp \n\nCоздан на основе открытого API openweathermap." +
                " В нем использована технология Open Feign из состава Spring Cloud. Добавлена REST точка для возможности получать данные от сервиса из сторонних приложений.\n";
    }
}
