import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

    public static List<Character> value = new ArrayList<>(Arrays.asList('2', '3', '4', '5', '6', '7', '8', '9', 'T','J', 'Q', 'K', 'A' ));
    public List<Character> suits = new ArrayList<>(Arrays.asList('C', 'D', 'H', 'S'));

    String card;

    public Card() {
        this.card = value.get((int)(Math.random()*value.size())).toString() + suits.get((int)(Math.random()*suits.size())).toString();
    }

    public Card(Character value, Character suit) {
        card = value.toString() + suit.toString();
    }

    @Override
    public String toString() {
        return card;
    }
}
