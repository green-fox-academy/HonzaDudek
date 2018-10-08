import java.util.Locale;
import java.util.Scanner;

public class Aircraft {
    String type;
    int maxAmmunition;
    int currentAmmo = 0;
    int damage;

    public Aircraft() {

    }

    public int aircraftDamage() {
        int damage = currentAmmo*this.damage;
        return damage;
    }

    public int fight() {
        int damageDealt = currentAmmo*this.damage;
        currentAmmo = 0;
        return damageDealt;
    }

    public int refill(int ammo) {
        System.out.println("Refilling " + this.type + " with " + ammo + " ammunition....");
        this.currentAmmo += ammo;
        if (this.currentAmmo > maxAmmunition) {
            currentAmmo = maxAmmunition;
            System.out.println("Refilled, the " + this.type + " has currently "+ this.currentAmmo + " ammo.");
            return (ammo - maxAmmunition);
        }
        System.out.println("Refilled, the " + this.type + " has currently "+ this.currentAmmo + " ammo.");
        return currentAmmo;
    }

    public String getType(){
        System.out.println(this.type);
        return this.type;
    }

    public void getStatus(){
        System.out.printf("Type %s, / Ammo: %d / Base damage: %d / All damage %d. \n", this.type, this.currentAmmo, this.damage, (this.damage * this.currentAmmo));
    }

    public boolean isPriority() {
        if (this instanceof F35) {
            return true;
        }
        else {
            return false;
        }
    }
}
