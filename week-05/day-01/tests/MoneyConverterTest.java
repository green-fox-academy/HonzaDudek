import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class MoneyConverterTest {

    @Test
    public void numberToWord() {
        assertEquals(MoneyConverter.converting(5),"five");
    }

    @Test
    public void sixToWord() {
        assertEquals(MoneyConverter.converting(6), "six");
    }

    @Test
    public void twelveToWord() {
        assertEquals(MoneyConverter.converting(12), "twelve");
    }

    @Test
    public void twentyToWord() {
        assertEquals(MoneyConverter.converting(22), "twenty two");
    }
    @Test
    public void fiftyToWord() {
        assertEquals(MoneyConverter.converting(56), "fifty six");
    }
    @Test
    public void hundredToWord() {
        assertEquals(MoneyConverter.converting(145), "one hundred and forty five");
    }
}
