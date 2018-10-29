import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

public class MainTest {

    String string1 = "dog";
    String string2 = "god";

    @Test
    public void sameSizeStrings() {
        assertEquals(Main.areAnagram(string1, string2), true);
    }

    @Test
    public void haveSameFirstLetters() {
        assertEquals(Main.areAnagram(string1, "asd"), false);
    }

    @Test
    public void haveSameLetters(){
        assertEquals(Main.areAnagram(string1, string2), true);
    }

    @Test
    public void aNetisNeat() {
        assertEquals(Main.areAnagram("a net", "neat"), true);
    }

    @Test
    public void aNetisNeeat() {
        assertEquals(Main.areAnagram("a net", "neeat"), false);
    }
}
