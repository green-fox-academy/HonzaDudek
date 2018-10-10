public class Sharpie {
    String color;
    float width;
    int inkAmmount = 100;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public int use() {
        inkAmmount--;
        return inkAmmount;
    }
}
