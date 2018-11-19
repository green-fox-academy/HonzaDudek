import org.junit.Test;

import static org.junit.Assert.*;

public class PokerTest {

    @Test
    public void test1(){
        Player jan = new Player("Jan", "2H 3D 5S 9C KD");
        Player jonathan = new Player("Jonathan", "2C 3H 4S 8C AH");
        assertEquals("Jonathan wins! - (High card: Ace)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test2(){
        Player jan = new Player("Jan", "2C 3H 4S 8C AH");
        Player jonathan = new Player("Jonathan", "2H 3D 5S 9C KD");
        assertEquals("Jan wins! - (High card: Ace)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test3(){
        Player jan = new Player("Jan", "2C 3H 4S 8C KD");
        Player jonathan = new Player("Jonathan", "2H 3D 5S 9C QS");
        assertEquals("Jan wins! - (High card: Ace)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test4(){
        Player jan = new Player("Jan", "2C 3H 4S 8C KD");
        Player jonathan = new Player("Jonathan", "2H AD 5S 9C QS");
        assertEquals("Jonathan wins! - (High card: Ace)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test5(){
        Player jan = new Player("Jan", "2C 3H 4S KC AD");
        Player jonathan = new Player("Jonathan", "2H AD 5S 9C QS");
        assertEquals("Jan wins! - (High card: Ace)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test6(){
        Player jan = new Player("Jan", "AC 3H 4S KC 2D");
        Player jonathan = new Player("Jonathan", "AC 2H 4H KC 3C");
        assertEquals("Tie.", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test7(){
        Player jan = new Player("Jan", "3S 3H 4S KC 2D");
        Player jonathan = new Player("Jonathan", "AC 2H 4H KC 3C");
        assertEquals("Jan wins! - (Pair)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test8(){
        Player jan = new Player("Jan", "3S 3H 4S KC 2D");
        Player jonathan = new Player("Jonathan", "AC 4H 4H KC 3C");
        assertEquals("Jonathan wins! - (Pair)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test9(){
        Player jan = new Player("Jan", "3S 3H 3D KC 2D");
        Player jonathan = new Player("Jonathan", "AC 4H 4H KC 3C");
        assertEquals("Jan wins! - (Three of a kind)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test10(){
        Player jan = new Player("Jan", "3S AH 4S 2H 2S");
        Player jonathan = new Player("Jonathan", "3S KH 4S 2H 2S");
        assertEquals("Jan wins! - (High card: Ace)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test11(){
        Player jan = new Player("Jan", "3S 3H 3D KC 2D");
        Player jonathan = new Player("Jonathan", "2S 3H 4S 5H 6S");
        assertEquals("Jonathan wins! - (Straight)", Poker.handChecker(jan, jonathan));
    }

    @Test
    public void test12(){
        Player jan = new Player("Jan", "3S 3H KD KC 2D");
        Player jonathan = new Player("Jonathan", "AC 4H 4H KC 3C");
        assertEquals("Jan wins! - (Double pair)", Poker.handChecker(jan, jonathan));
    }


}