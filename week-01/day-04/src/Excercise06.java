public class Excercise06 {
    public static void main(String[] args) {
        int dailyCodingHours = 6;
        int weeksInSemester = 17;
        int workingHoursInWeek = 52;

        int hoursSpendCodingInSemester = dailyCodingHours * 5 * weeksInSemester;
        double percentageOfCodingTime = (double)hoursSpendCodingInSemester / (workingHoursInWeek * weeksInSemester) * 100;

        System.out.println("Student codes for " + hoursSpendCodingInSemester + " hours during the semester." );
        System.out.println("That is " + String.format("%.2f", percentageOfCodingTime) + "% of the regular working time in the period.");
    }
}
