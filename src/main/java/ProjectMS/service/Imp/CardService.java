package ProjectMS.service.Imp;

import ProjectMS.dto.cardDtos.getCardDto;
import ProjectMS.dto.cardDtos.postCardDto;
import ProjectMS.dto.cardDtos.putCardDto;
import ProjectMS.model.Card;
import ProjectMS.repository.CardRepository;
import ProjectMS.service.ICardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService implements ICardService {
    private final CardRepository cardRepository;
    @Override
    public List<getCardDto> getCards() {
        List<Card> cards = cardRepository.findByDeletedFalse();
        return List.of();
    }

    @Override
    public getCardDto getCard(int cardId) {
        return null;
    }

    @Override
    public getCardDto addCard(postCardDto card) {
        return null;
    }

    @Override
    public getCardDto updateCard(putCardDto card) {
        return null;
    }

    @Override
    public void deleteCard(int cardId) {

    }
}
