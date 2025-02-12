package ProjectMS.controller;

import ProjectMS.dto.cardDtos.getCardDto;
import ProjectMS.dto.cardDtos.postCardDto;
import ProjectMS.dto.cardDtos.putCardDto;
import ProjectMS.model.Card;
import ProjectMS.repository.CardRepository;
import ProjectMS.service.Imp.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/card")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    @GetMapping
    public List<getCardDto> getAllCards() {
        return cardService.getCards();
    }
    @GetMapping("/{id}")
    public ResponseEntity<getCardDto> getCardById(@PathVariable int id) {
        return ResponseEntity.ok(cardService.getCard(id));
    }
    @PostMapping
    public ResponseEntity<getCardDto> create(@RequestBody postCardDto card) {
        return ResponseEntity.ok(cardService.addCard(card));
    }
    @PutMapping
    public ResponseEntity<getCardDto> update(@RequestBody putCardDto card) {
        return ResponseEntity.ok(cardService.updateCard(card));
    }
    @DeleteMapping
    public ResponseEntity delete(@PathVariable int id) {
        cardService.deleteCard(id);
        return ResponseEntity.ok().build();
    }
}
