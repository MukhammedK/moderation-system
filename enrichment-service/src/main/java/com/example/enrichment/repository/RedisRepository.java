package com.example.enrichment.repository;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisRepository {

    private final StringRedisTemplate redisTemplate;

    public RedisRepository(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public boolean hasActiveRequest(String clientId, String category) {
        String key = buildActiveRequestKey(clientId, category);
        return Boolean.TRUE.equals(redisTemplate.hasKey(key));
    }

    private String buildActiveRequestKey(String clientId, String category) {
        return "client:" + clientId + ":active:" + category;
    }
}
