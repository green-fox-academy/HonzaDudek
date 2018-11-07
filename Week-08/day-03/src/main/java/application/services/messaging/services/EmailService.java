package application.services.messaging.services;

public class EmailService implements MessageService {

    @Override
    public void processMessage(String message, String target) {
        System.out.println("Email Sent to " + target + " with message: " + message);
    }
}
