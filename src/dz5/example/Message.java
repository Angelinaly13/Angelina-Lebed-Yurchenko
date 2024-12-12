package dz5.example;

import java.util.Map;

public record Message(Map<String, String> content, EnrichmentType enrichmentType) {
    public Map<String, String> getContent() {
        return content;
    }

    public EnrichmentType getEnrichmentType() {
        return enrichmentType;
    }

    public enum EnrichmentType {
        MSISDN
    }
}