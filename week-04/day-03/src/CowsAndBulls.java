import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CowsAndBulls {

    public CowsAndBulls() {
        this.isPlaying = true;
        this.generateNumber();
        this.splitGeneratedNumber();
        this.guess();
    }

    int guesses = 0;
    int numberToGuess;
    boolean isPlaying;
    int numberOfCows = 0;
    int numberOfBulls = 0;
    ArrayList<Integer> guess;

    public int generateNumber() {
        numberToGuess = 1000 + (int) (Math.random() * ((9999 - 1000) + 1));
        System.out.println(numberToGuess);
        return numberToGuess;
    }

    public ArrayList<Integer> splitGeneratedNumber() {
        ArrayList digits = new ArrayList();
        int counter = 1;
        for (int i = 10; i < 100000; i *= 10) {
            digits.add((numberToGuess % i) / counter);
            counter *= 10;
        }
        Collections.reverse(digits);
        return digits;
    }

    public ArrayList<Integer> guess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide your guess:");
        int guess = scanner.nextInt();
        ArrayList guessArray = new ArrayList();
        int counter = 1;
        for (int i = 10; i < 100000; i *= 10) {
            guessArray.add((numberToGuess % i) / counter);
            counter *= 10;
        }
        return guessArray;
    }

    public void play() {
        while(this.isPlaying) {
            this.guess();

            for (int i = 0; i < 4; i++) {
                if (this.guess().get(i).equals(this.splitGeneratedNumber().get(i))) {
                    numberOfCows++;
                } else if (this.splitGeneratedNumber().contains(this.guess().get(i))) {
                    numberOfBulls++;
                }
                else {
                    System.out.println("wrong guess");
                }
                this.guesses++;
            }
            this.isPlaying=false;
            System.out.println("Number of cows " + numberOfCows);
            System.out.println("Number of bulls " + numberOfBulls);
            System.out.println("Number of guesses" + this.guesses);
        }
    }

    public static void main(String[] args) {
        CowsAndBulls test = new CowsAndBulls();
        test.play();
    }

}
