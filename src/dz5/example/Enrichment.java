package dz5.example;

import java.util.Map;

public interface Enrichment {
    Map<String, String> enrich(Map<String, String> input);
}
