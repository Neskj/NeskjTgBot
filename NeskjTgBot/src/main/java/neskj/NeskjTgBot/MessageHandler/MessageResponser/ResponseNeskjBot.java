package neskj.NeskjTgBot.MessageHandler.MessageResponser;

public class ResponseNeskjBot implements MessageResponser{

    @Override
    public String responseTheMessage() {
        return "Информационный телеграм - бот. \n\nГитХаб: https://github.com/Neskj/NeskjTgBot \n\n"+
                "Содержит всю информацию о моих проектах, со временем будет пополняться. Это  2 реализация бота. Использует API от стороннего сервиса с помощью OpenFeign. Ответы спроектированы с использованием паттерна стратегия + используется шаблон декоратор.\n\n"+
                "Использованы технологии: \nJava 21, Spring Boot/Cloud, библиотека telegrambots, jUnit 5, паттерны проектирования ООП";
    }
}
