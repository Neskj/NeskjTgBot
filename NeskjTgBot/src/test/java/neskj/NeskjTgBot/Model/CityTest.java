package neskj.NeskjTgBot.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class CityTest {

    @InjectMocks
    private City testCity;

    @BeforeEach
    public void init(){

        testCity=new City("Balashikha");
    }

    @Test
    public void makeCityNotNull(){

        assertNotNull(testCity);
    }

    @Test
    public void gettersTestHappyFlow(){

        assertEquals("Balashikha",testCity.getCity());
    }

    @Test
    public void settersTestHappyFlow(){

        testCity.setCity("Lubertcy");

        assertEquals("Lubertcy",testCity.getCity());

    }
}
