package neskj.NeskjTgBot.MessageHandler.MessageResponser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ResponseDefaultTest {

    private final ResponseDefault responseDefault = new ResponseDefault();

    @Test
    public void returnNotNullmessage() {

        assertNotNull(responseDefault.responseTheMessage());
    }

    @Test
    public void returnCorrectMessage() {

        String expectMessage = "Непонятен запрос. Введтите : \n\n* /weather - для перехода к погодному сервису," +
                " \n* /drager - проверить базу по газоанализаторам, \n* /generator - сгенерировать QR код для прохода на территорию ЦТД, " +
                "\n* /bot - информация об этом боте \n\nили воспользуйтесь кнопкой меню";

        assertEquals(expectMessage, responseDefault.responseTheMessage());
    }
}
