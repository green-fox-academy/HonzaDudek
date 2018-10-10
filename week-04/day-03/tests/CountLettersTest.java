import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters = new CountLetters();



    @Test
    public void countLettersTest() {
        HashMap<Character, Integer> testHash = new HashMap();
        testHash.put('K', 1);
        testHash.put('a', 1);
        testHash.put('r', 1);
        testHash.put('e', 2);
        testHash.put('l', 2);
        assertEquals(testHash, countLetters.countLetters("Karelle"));
    }

}