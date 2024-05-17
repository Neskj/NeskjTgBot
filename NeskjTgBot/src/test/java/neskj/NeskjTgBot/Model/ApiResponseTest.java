package neskj.NeskjTgBot.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApiResponseTest {

    private ApiResponse expectResponse;

    @BeforeEach
    public void init() {

        expectResponse = new ApiResponse();
        expectResponse.setTemp("21");
        expectResponse.setFeelsLike("25");
        expectResponse.setTempMin("19");
        expectResponse.setTempMax("23");
    }

    @Test
    public void notNullWhenCreate() {

        assertNotNull(expectResponse);
    }

    @Test
    public void gettersTestHappyFlow() {

        assertEquals("21", expectResponse.getTemp());
        assertEquals("25", expectResponse.getFeelsLike());
        assertEquals("19", expectResponse.getTempMin());
        assertEquals("23", expectResponse.getTempMax());
    }

    @Test
    public void settersTestHappyFlow() {

        expectResponse.setTemp("-10");
        expectResponse.setFeelsLike("-15");
        expectResponse.setTempMin("-12");
        expectResponse.setTempMax("-5");

        assertEquals("-10", expectResponse.getTemp());
        assertEquals("-15", expectResponse.getFeelsLike());
        assertEquals("-12", expectResponse.getTempMin());
        assertEquals("-5", expectResponse.getTempMax());
    }

    @Test
    public void testReturnToStringSuccess() {

        String expectString = "Температура : 21\nОщущается как : 25\nМинимум : 19\nМаксимум : 23\n";

        assertEquals(expectString, expectResponse.toString());
    }
}
