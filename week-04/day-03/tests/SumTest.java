import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class SumTest {
    Sum newSum = new Sum();
    List listofIntegers = new ArrayList();

    @Test
    public void sumTest() {
        listofIntegers.add(10);
        listofIntegers.add(20);
        assertEquals(30, newSum.Sum(listofIntegers));
    }

}