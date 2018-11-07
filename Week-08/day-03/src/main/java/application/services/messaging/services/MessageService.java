package application.services.messaging.services;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    public void processMessage(String message, String target);
}
