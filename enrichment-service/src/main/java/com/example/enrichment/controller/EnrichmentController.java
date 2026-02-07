package com.example.enrichment.controller;

import com.example.enrichment.model.EnrichmentResponse;
import com.example.enrichment.service.EnrichmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrichmentController {

    private final EnrichmentService enrichmentService;

    public EnrichmentController(EnrichmentService enrichmentService) {
        this.enrichmentService = enrichmentService;
    }

    @GetMapping("/enrichment")
    public EnrichmentResponse getEnrichment(
            @RequestParam String clientId,
            @RequestParam String category
    ) {
        return enrichmentService.enrich(clientId, category);
    }
}
