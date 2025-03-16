package ProjectMS.config.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    // Consumer Endpointi
    @KafkaListener(topics = "reclam", groupId = "my-group")
    public void consumeMessage(String message) {
        System.out.println("Received Message: " + message);
    }
}
