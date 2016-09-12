package burns.chris.Initialization;

import static org.junit.Assert.*;
import org.junit.Test;


public class InitializationTest {
    @Test
    public void getColorTest(){
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing.Color expectedValue = ColorfulThing.Color.BLUE;
        ColorfulThing.Color actualValue = colorfulThing.getColor();
        assertSame(expectedValue, actualValue);
    }
}
