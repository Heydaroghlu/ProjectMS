package ProjectMS.redis;

import ProjectMS.dto.reclamDtos.reclamGetDto;
import ProjectMS.model.Reclam;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReclamRedisRepository implements IRedisRepository {
    private final RedisTemplate<String, Object> redisTemplate;
    private final ModelMapper mapper;
    @Override
    public void save(String key, Reclam object) {
        redisTemplate.opsForValue().set(key,object);
    }
    @Override
    public Reclam getById(String key) {
        var value=redisTemplate.opsForValue().get(key);
        if(value!=null){
            return mapper.map(value,Reclam.class);
        }
        return null;
    }
}
