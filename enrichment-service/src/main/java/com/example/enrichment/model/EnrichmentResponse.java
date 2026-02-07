package com.example.enrichment.model;

public class EnrichmentResponse {

    private boolean hasActiveRequest;
    private String category;
    private String comment;

    public EnrichmentResponse() {
    }

    public EnrichmentResponse(boolean hasActiveRequest, String category, String comment) {
        this.hasActiveRequest = hasActiveRequest;
        this.category = category;
        this.comment = comment;
    }

    public boolean isHasActiveRequest() {
        return hasActiveRequest;
    }

    public void setHasActiveRequest(boolean hasActiveRequest) {
        this.hasActiveRequest = hasActiveRequest;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
