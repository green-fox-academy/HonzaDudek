public class excercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInDay = 60 * 60 * 24;
        int remainingSeconds = secondsInDay - ((currentHours * 60 * 60) + (currentMinutes * 60) + (currentSeconds));

        System.out.println("Today remains " + remainingSeconds + " seconds.");
    }
}
