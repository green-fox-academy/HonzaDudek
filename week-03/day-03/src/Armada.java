import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> newArmada = new ArrayList<>();

    public  Armada() {

    }

    public List fillArmada(Armada armada) {
        for (int i = 0; i < 10 ; i++) {
            Ship newShip = new Ship();
            newArmada.add(newShip);
            newShip.name = "ship" + (i + 1);
            System.out.println(newShip.name);
        }
        return newArmada;
    }

//    public void war(Armada otherArmada) {
//        Armada myArmada;
//        for (int i = 0; i < newArmada.size(); i++) {
//            newArmada.get(i).shipBattle(otherArmada.get(i));
//        }
//    }

}
