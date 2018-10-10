import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    Sharpie sharpie = new Sharpie("blue", 20);

    @Test
    public void use() {
        assertEquals(99, sharpie.use());
    }
}