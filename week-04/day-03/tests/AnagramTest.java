import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void isAnagramTest() {
        anagram.string1 = "larek";
        anagram.string2 = "karel";
        assertTrue(anagram.isAnagram(anagram.string1, anagram.string2));
    }


}

