package application;

import application.models.message.MessageProceeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageserviceApplication implements CommandLineRunner {

    @Autowired
    MessageProceeder messageProceeder;

    public static void main(String[] args) {
        SpringApplication.run(MessageserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
    }
