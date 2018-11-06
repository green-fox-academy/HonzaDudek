package bankOfSimbaApp;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Account {
    String name;
    String balance;
    String animalType;
    NumberFormat formatter = new DecimalFormat("#0.00");
    boolean isKing;

    public Account() {
    }

    public Account(String name, double balance, String animalType) {
        this.name = name;
        this.balance = formatter.format(balance) + " Zebra";
        this.animalType = animalType;
        this.isKing = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
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

    public String toString() {
        return this.name + " " + this.balance + " " + this.animalType;
    }
}
