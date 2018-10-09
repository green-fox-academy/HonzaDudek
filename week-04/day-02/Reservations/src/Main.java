import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Reservation> newList = new ArrayList<>();
        newList.add(new Reservation());
        newList.add(new Reservation());
        newList.add(new Reservation());
        newList.add(new Reservation());
        newList.add(new Reservation());
        newList.add(new Reservation());

        for (Reservation res: newList
             ) {
            res.printReservation();
        }
    }
}
