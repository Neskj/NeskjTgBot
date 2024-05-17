package neskj.NeskjTgBot.MessageHandler.MessageResponser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ResponseNeskjBotTest {

    private final ResponseNeskjBot responseBot = new ResponseNeskjBot();

    @Test
    public void returnNotNullMessage() {

        assertNotNull(responseBot.responseTheMessage());
    }

    @Test
    public void returnCorrectMessage() {

        String expectMessage = "Информационный телеграм - бот. \n\nГитХаб: https://github.com/Neskj/NeskjTgBot \n\n" +
                "Содержит всю информацию о моих проектах, со временем будет пополняться. Это  2 реализация бота. Использует API от стороннего сервиса с помощью OpenFeign. Ответы спроектированы с использованием паттерна стратегия + используется шаблон декоратор.\n\n" +
                "Использованы технологии: \nJava 21, Spring Boot/Cloud, библиотека telegrambots, jUnit 5, паттерны проектирования ООП";

        assertEquals(expectMessage, responseBot.responseTheMessage());
    }
}
