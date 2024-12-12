package dz5.example;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class EnrichmentService {
    private final Map<Message.EnrichmentType, Enrichment> enrichments = new ConcurrentHashMap<>();

    public void registerEnrichment(Message.EnrichmentType type, Enrichment enrichment) {
        enrichments.put(type, enrichment);
    }

    public Message applyEnrichment(Message message) {
        Enrichment enrichment = enrichments.get(message.getEnrichmentType());
        if (enrichment == null) {
            return message;
        }

        Map<String, String> enrichedContent = enrichment.enrich(new ConcurrentHashMap<>(message.getContent()));
        return new Message(enrichedContent, message.getEnrichmentType());
    }
}
