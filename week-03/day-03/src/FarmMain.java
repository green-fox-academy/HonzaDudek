public class FarmMain {
    public static void main(String[] args) {
        Farm newFarm = new Farm();

        newFarm.listOfAnimals.add(new Animal());
        newFarm.listOfAnimals.add(new Animal());

        System.out.println(newFarm.listOfAnimals.size());

        newFarm.listOfAnimals.get(0).play();
        newFarm.slaughter();

        System.out.println(newFarm.listOfAnimals.size());

        newFarm.breed();
        System.out.println(newFarm.listOfAnimals.size());

        newFarm.breed();
        System.out.println(newFarm.listOfAnimals.size());

        newFarm.breed();
        System.out.println(newFarm.listOfAnimals.size());


    }
}
