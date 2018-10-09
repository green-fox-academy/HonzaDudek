public class Shifter implements CharSequence {
    String string;
    int shift;


    public Shifter(String string, int number) {
        this.string = string;
        this.shift = number;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index + this.shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
