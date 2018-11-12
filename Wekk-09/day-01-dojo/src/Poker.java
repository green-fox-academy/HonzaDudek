import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Poker {

    public static String handChecker(Player... players) {
        sortHand(players[0].hand);
        sortHand(players[1].hand);
        return checkStraight(players[0], players[1]);
    }

    private static String checkStraight(Player... players) {
        Integer player0StraightValue = 0;
        Integer player1StraightValue = 0;
        boolean straight = false;
        if (getIndex(players[0].hand.get(4)) - getIndex(players[0].hand.get(0)) == 4) {
            player0StraightValue = getIndex(players[0].hand.get(4));
            straight = true;
        }
        if (getIndex(players[1].hand.get(4)) - getIndex(players[1].hand.get(0)) == 4) {
            player1StraightValue = getIndex(players[1].hand.get(4));
            straight = true;
        }

        if (straight) {
            if (player0StraightValue > player1StraightValue) {
                return players[0].name + " wins! - (Straight)";
            } else if (player0StraightValue < player1StraightValue) {
                return players[1].name + " wins! - (Straight)";
            }
            return "Tie.";
        }
        return checkThreeOfAKind(players[0], players[1]);
    }

    private static String checkThreeOfAKind(Player... players) {
        Integer player1ThreeOfAKindValue = 0;
        Integer player2ThreeOfAKindValue = 0;
        for (int i = 0; i < 3; i++) {
            if (getIndex(players[0].hand.get(i)) == getIndex(players[0].hand.get(i + 1)) &&
                    getIndex(players[0].hand.get(i)) == getIndex(players[0].hand.get(i + 2))) {
                player1ThreeOfAKindValue = getIndex(players[0].hand.get(i));
            }
            if (getIndex(players[1].hand.get(i)) == getIndex(players[1].hand.get(i + 1)) &&
                    getIndex(players[1].hand.get(i)) == getIndex(players[1].hand.get(i + 2))) {
                player2ThreeOfAKindValue = getIndex(players[1].hand.get(i));
            }
        }
        if (player1ThreeOfAKindValue > player2ThreeOfAKindValue) {
            return players[0].name + " wins! - (Three of a kind)";
        } else if (player1ThreeOfAKindValue < player2ThreeOfAKindValue) {
            return players[1].name + " wins! - (Three of a kind)";
        }
        return checkDoublePair(players[0], players[1]);
    }



    static String checkDoublePair(Player... players) {
        if (countDifferentValues(players[0].hand) == 3 &&
                countDifferentValues(players[1].hand) == 3) {
            if (getIndex(players[0].hand.get(4)) > getIndex(players[1].hand.get(4))) {
                return players[0].name + " wins! - (Higher Double pair)";
            } else {
                return players[1].name + " wins! - (Higher Double pair)";
            }
        } else if (countDifferentValues(players[0].hand) == 3) {
            return players[0].name + " wins! - (Double pair)";
        } else if (countDifferentValues(players[1].hand) == 3){
            return players[1].name + " wins! - (Double pair)";
        } else {
            return checkPair(players[0], players[1]);
        }
    }


    static String checkPair(Player... players) {
        int player1PairValue = 0;
        int player2PairValue = 0;
        for (int i = 0; i < 4; i++) {
            if (getIndex(players[0].hand.get(i)) == getIndex(players[0].hand.get(i + 1))) {
                player1PairValue = getIndex(players[0].hand.get(i));
            }
            if (getIndex(players[1].hand.get(i)) == getIndex(players[1].hand.get(i + 1))) {
                player2PairValue = getIndex(players[1].hand.get(i));
            }
        }
        if (player1PairValue > player2PairValue) {
            return players[0].name + " wins! - (Pair)";
        } else if (player1PairValue < player2PairValue) {
            return players[1].name + " wins! - (Pair)";
        }
        return checkHighCard(players[0], players[1]);

    }

    private static int getIndex(Card card) {
        return Card.value.indexOf(card.toString().charAt(0));
    }

    static String checkHighCard(Player... players) {
        String winningCondition = "High card: Ace";
        for (int i = 4; i >= 0; i--) {
            int indexP0 = getIndex(players[0].hand.get(i));
            int indexP1 = getIndex(players[1].hand.get(i));
            if (indexP0 != indexP1) {
                return (indexP0 > indexP1 ? players[0].name : players[1].name) + " wins! - (" + winningCondition + ")";
            }
        }
        return "Tie.";
    }

    static void sortHand(List<Card> hand) {
        int i = 0;
        while (i < 4) {
            if (getIndex(hand.get(i)) >
                    getIndex(hand.get(i + 1))) {
                Card temp = hand.get(i);
                hand.set(i, hand.get(i + 1));
                hand.set(i + 1, temp);
                i = -1;
            }
            i++;
        }
    }


    static int countDifferentValues(List<Card> hand) {
        int differentValues = 0;
        for (int i = 0; i < hand.size()-1 ; i++) {
            if (getIndex(hand.get(i)) != getIndex(hand.get(i))+1) {
                differentValues++;
            }
        }
        return differentValues;
    }
}
