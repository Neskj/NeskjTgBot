package neskj.NeskjTgBot.MessageHandler.MessageResponser;

public class ResponseJournal implements MessageResponser{

    @Override
    public String responseTheMessage() {
        return "Веб Журнал ремонта.\n\nСостоит из клиентской и серверной части. \n\nАдрес клиента: http://185.198.152.105:6066/journal \n\nКлиентское приложение на ГитХаб: https://github.com/Neskj/RepairJournalClient \nСерверное приложение на ГитХаб: https://github.com/Neskj/RepairJournal\n\n"+
                "Клиентская часть через формы ввода позволяет отправить данные по API на серверное приложение и получить ответ для интерпритации и вывода в представление. Сервер имеет репозиторий, управляемый Spring Data. Составлены кастомные Query методы для CRUD операций \n\n"+
                "Использованы технологии: \nJava 21, Spring Boot, Spring Data, Spring Cloud, Postgresql, jUnit 5, фронтэнд: HTML+CSS+Thymeleaf \n\n";
    }
}
