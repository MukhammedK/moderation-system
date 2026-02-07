package com.example.enrichment.service;

import com.example.enrichment.model.EnrichmentResponse;
import com.example.enrichment.repository.RedisRepository;
import org.springframework.stereotype.Service;

@Service
public class EnrichmentService {

    private final RedisRepository redisRepository;

    public EnrichmentService(RedisRepository redisRepository) {
        this.redisRepository = redisRepository;
    }

    public EnrichmentResponse enrich(String clientId, String category) {

        boolean hasActive = redisRepository.hasActiveRequest(clientId, category);

        return new EnrichmentResponse(
                hasActive,
                category,
                hasActive ? "Active request found" : "No active request"
        );
    }
}
