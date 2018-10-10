import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {


    Apple apple = new Apple();

    @Test
    public void getApplesTest() {
        assertEquals("orange", apple.getApple());
    }
}
