package neskj.NeskjTgBot.MessageHandler.MessageResponser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ResponseStartTest {

    private final ResponseStart responseStart = new ResponseStart();

    @Test
    public void returnNotNullMessage() {

        assertNotNull(responseStart.responseTheMessage());
    }

    @Test
    public void returnCorrectMessage() {

        String expectMessage = "Реализованные проекты:\n\n*  Погодный сервис /weather" +
                "\n\n*  Метрологический info-сервис по газоанализаторам /drager" +
                "\n\n*  Веб генератор QR пропуска на предприятие /generator\n\n*  Информационный бот /bot";

        assertEquals(expectMessage, responseStart.responseTheMessage());
    }
}
