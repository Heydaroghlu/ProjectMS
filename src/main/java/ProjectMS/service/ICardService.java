package ProjectMS.service;

import ProjectMS.model.Card;
import ProjectMS.dto.cardDtos.getCardDto;
import ProjectMS.dto.cardDtos.putCardDto;
import ProjectMS.dto.cardDtos.postCardDto;

import java.util.List;

public interface ICardService {
    public List<getCardDto> getCards();
    public getCardDto getCard(int cardId);
    public getCardDto addCard(postCardDto card);
    public getCardDto updateCard(putCardDto card);
    public void deleteCard(int cardId);
}
