package ProjectMS.service.Imp;

import ProjectMS.dto.cardDtos.getCardDto;
import ProjectMS.dto.cardDtos.postCardDto;
import ProjectMS.model.Card;
import ProjectMS.service.IRedisService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class RedisService implements IRedisService {
    private final RedisTemplate<String, Object> redisTemplate;
    private final ModelMapper mapper;
    @Override
    public void save(String unique, getCardDto o) {
        redisTemplate.opsForValue().set(unique+o.getId(),o, TimeUnit.SECONDS.toHours(1));
    }

    @Override
    public getCardDto get(String key) {
        return null;
    }
}
