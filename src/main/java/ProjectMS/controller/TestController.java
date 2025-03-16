package ProjectMS.controller;

import ProjectMS.config.kafka.KafkaConsumer;
import ProjectMS.config.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final KafkaProducer kafkaProducer;
    private final KafkaConsumer kafkaConsumer;
    @PostMapping
    public CompletableFuture<ResponseEntity> test(@RequestBody String messafe) {
        return CompletableFuture.runAsync(() -> kafkaProducer.sendMessage(messafe))
                .thenApply(aVoid -> ResponseEntity.ok().build());
    }

}
