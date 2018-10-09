public class Main {
    public static void main(String[] args) {

        Carrier carrier = new Carrier(500, 1000);
        Carrier carrier1 = new Carrier(10000, 800);
        Carrier carrier2 = new Carrier(10000, 800);


        carrier1.addRandom();
        carrier2.addRandom();

        carrier1.fill();
        carrier2.fill();

        carrier1.fight(carrier2);



//        carrier.getStatus();
//
//        carrier.add("f16");
//        carrier.add("f16");
//        carrier.add("f16");
//        carrier.add("f35");
//        carrier.add("f35");
//        carrier.add("f35");
//
//        carrier.fill();
//
//        carrier.fight(carrier1);
//        carrier.getStatus();
    }
}
