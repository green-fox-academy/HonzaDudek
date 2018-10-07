public class BattleApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        ship1.fillShip();
        ship2.fillShip();
        ship1.shipStatus(ship1);
        ship2.shipStatus(ship2);
        ship1.shipBattle(ship2);
        ship1.shipStatus(ship1);
        ship2.shipStatus(ship2);
    }
}
