package neskj.NeskjTgBot.MessageHandler.MessageResponser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ResponseWeatherAppTest {

    private final ResponseWeatherApp responseWeather = new ResponseWeatherApp();

    @Test
    public void returnNotNullMessage() {

        assertNotNull(responseWeather.responseTheMessage());
    }

    @Test
    public void returnCorrectMessage() {

        String expectMessage = "Погодный сервис.\n\nАдрес: http://185.198.152.105:8086/weather \n\nГитХаб: https://github.com/Neskj/ProjectWeatherApp \n\nCоздан на основе открытого API openweathermap." +
                " В нем использована технология Open Feign из состава Spring Cloud. Добавлена REST точка для возможности получать данные от сервиса из сторонних приложений.\n\n" +
                "Использованы технологии: \nJava 21, Spring Boot/Cloud, REST Api, jUnit 5, фронтэнд: HTML+CSS+Thymeleaf ";

        assertEquals(expectMessage, responseWeather.responseTheMessage());
    }
}
