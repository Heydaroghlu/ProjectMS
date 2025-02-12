package ProjectMS.service;

public interface IRedisService<T> {
    void save(String unique,T t);
    T get(String key);
}
