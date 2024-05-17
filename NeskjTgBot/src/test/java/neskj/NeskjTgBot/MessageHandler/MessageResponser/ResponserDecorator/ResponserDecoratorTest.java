package neskj.NeskjTgBot.MessageHandler.MessageResponser.ResponserDecorator;

import neskj.NeskjTgBot.MessageHandler.MessageResponser.MessageResponser;
import neskj.NeskjTgBot.MessageHandler.MessageResponser.ResponseStart;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ResponserDecoratorTest {

    private final MessageResponser expectResponser = new ResponseStart();

    @Mock
    private MessageResponser messageResponser;

    @InjectMocks
    private ResponserDecorator decorator;

    @Test
    public void returnNotNullMessage() {

        when(messageResponser.responseTheMessage()).thenReturn(expectResponser.responseTheMessage());

        assertNotNull(decorator.responseTheMessage());
    }

    @Test
    public void returnCorrectMessage() {

        String expectMessage = "Реализованные проекты:\n\n*  Погодный сервис /weather" +
                "\n\n*  Метрологический info-сервис по газоанализаторам /drager" +
                "\n\n*  Веб генератор QR пропуска на предприятие /generator\n\n*  Информационный бот /bot";

        when(messageResponser.responseTheMessage()).thenReturn(expectResponser.responseTheMessage());

        assertEquals(expectMessage, decorator.responseTheMessage());
    }
}
