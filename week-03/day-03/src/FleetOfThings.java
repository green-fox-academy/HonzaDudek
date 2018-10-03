public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get Milk");
        fleet.add(milk);
        Thing obstacles = new Thing("Remove the obstacles");
        fleet.add(obstacles);
        Thing stand = new Thing("Stand up");
        stand.complete();
        fleet.add(stand);
        Thing eat = new Thing("Eat Lunch");
        eat.complete();
        fleet.add(eat);

        System.out.println(fleet);
    }
}