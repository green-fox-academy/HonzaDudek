public class Sharpie {
    String color;
    float width;
    float inkAmmount = 100;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmmount--;
    }
}
