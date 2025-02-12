package ProjectMS.service.Imp;

import ProjectMS.service.IRedisService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisService<T> implements IRedisService {
    private final RedisTemplate<String, Object> redisTemplate;
    private final ModelMapper mapper;
    @Override
    public void save(String unique,Object o) {
        redisTemplate.opsForValue().set(unique,o);
    }

    @Override
    public Object get(String key) {
        return null;
    }
}
