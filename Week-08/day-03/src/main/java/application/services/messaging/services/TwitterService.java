package application.services.messaging.services;

import org.springframework.context.annotation.Bean;

public class TwitterService implements MessageService {

    @Override
    public void processMessage(String message, String target) {
        System.out.println("Tweet: " + message + " processed at account: " + target);
    }

}
