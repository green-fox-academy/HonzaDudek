public class Earth {
    public static void main(String[] args) {


        Human tom = new Human();
        tom.age = 5;
        tom.eyeColor = "Brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";
        tom.speak();

        Human joe;
        joe = new Human();
        joe.name = "Joe Doe";
        joe.heightInInches = 120;
        joe.eyeColor = "Black";
        joe.age = 15;
        joe.speak();


    }
}
