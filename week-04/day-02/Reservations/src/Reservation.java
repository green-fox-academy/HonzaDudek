import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reservation implements Reservations{
    String code = " ";
    String booking;

    private List<String> DOW = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));

    public Reservation() {
        this.code = this.getCodeBooking();
        this.booking = this.getDOWBooking();
    }

    public void printReservation() {
        System.out.println("Booking# " + this.code + " for " + this.booking);
    }

    @Override
    public String getDOWBooking() {
        booking = DOW.get((int)( (Math.random()*DOW.size())));
        return booking;
    }

    @Override
    public String getCodeBooking() {
        for (int i = 0; i < 8; i++) {
            String charSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            code += charSet.charAt((int)(Math.random()* charSet.length()));
        }
        return code;
    }

}
