public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigits(1542));
    }

    public static int sumDigits(int number) {
        if (number >= 1) {
            return number%10 + sumDigits((number / 10) );
        }
        else {
            return number;
        }
    }
}
