package ProjectMS.service;

import ProjectMS.dto.cardDtos.getCardDto;
import ProjectMS.dto.cardDtos.postCardDto;
import ProjectMS.model.Card;

public interface IRedisService {
    void save(String unique, getCardDto t);
    getCardDto get(String key);
}
