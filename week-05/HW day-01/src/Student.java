public class Student extends Person {
    String previousOrganization;
    int skipDays;

    public Student() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = " The School of Life";
        skipDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
    }

    public void getGoal() {
        System.out.println("BE a junior software developer");
    }

    public void introduce() {
        System.out.println("Hi,I'm " + name + ", a " + age + " years old " + gender + " from "
                            + previousOrganization + " who skipped " + skipDays + " from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skipDays += numberOfDays;
    }
}
