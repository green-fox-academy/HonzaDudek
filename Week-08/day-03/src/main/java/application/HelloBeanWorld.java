package application;

import application.models.MyColor;
import application.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorld implements CommandLineRunner {

    @Autowired
    Printer printer;

    @Autowired
    MyColor myColor;



    public static void main(String[] args) {
        SpringApplication.run(HelloBeanWorld.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
    }
}
