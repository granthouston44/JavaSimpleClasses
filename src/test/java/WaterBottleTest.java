import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void initialVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkReducesVolume(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void multipleDrinkCalls(){
        assertEquals(80, bottle.drink(), bottle.drink());
    }
}
