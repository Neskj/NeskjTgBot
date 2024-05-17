package neskj.NeskjTgBot.MessageHandler.MessageResponser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ResponseDragerServiceTest {

    private final ResponseDragerService responseDrager = new ResponseDragerService();

    @Test
    public void returnNotNullmessage() {

        assertNotNull(responseDrager.responseTheMessage());
    }

    @Test
    public void returnCorrectMessage() {

        String expectMessage = "Сервис метрологических данных газоанализаторов.\n\nАдрес: http://185.198.152.105:9096/drager \n\nгостевой аккаунт: \nлогин: ctd\nпароль: 12345 \n\nГитХаб: https://github.com/Neskj/DragerService \n\n" +
                "Проект позволяет обеспечить метрологический контроль за используемыми газоанализаторами, их своевременную отправку на поверку/калибровку.\nСостояния : \n* окрашен красным - прибор просрочен\n* окрашен желтым - сдать в течение 5 дней \n\n" +
                "Использованы технологии: \nJava 21, Spring Boot, JDBC, Postgresql, jUnit 5, фронтэнд: HTML+CSS+Thymeleaf ";

        assertEquals(expectMessage, responseDrager.responseTheMessage());
    }
}
