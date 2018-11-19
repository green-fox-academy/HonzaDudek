package bankOfSimbaApp;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Account {
    String name;
    double balance;
    String animalType;
    DecimalFormat formatter = new DecimalFormat("0.00");
    boolean isKing;
    boolean isGood = false;

    public Account() {
    }

    public Account(String name, double balance, String animalType, String isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = false;
        this.isGood = isGood.equalsIgnoreCase("good");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return formatter.format(this.balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public String toString() {
        return this.name + " " + this.balance + " " + this.animalType;
    }

    public void raiseBalance() {
        double newBalance = this.balance;
        if (this.isKing) {
            newBalance += 100;
        }
        else {
            newBalance += 10;
        }
        this.balance = newBalance;
    }
}
