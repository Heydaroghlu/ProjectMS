package ProjectMS.controller;

import ProjectMS.config.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducer kafkaProducer;
    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaProducer.sendMessage(message);
        return "Message sent: " + message;
    }

}
