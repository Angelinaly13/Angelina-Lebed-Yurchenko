package dz5.example;

import java.util.Map;

public class MsisdnEnrichment implements Enrichment {
    private final UserRepository userRepository;

    public MsisdnEnrichment(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Map<String, String> enrich(Map<String, String> input) {
        String msisdn = input.get("msisdn");
        if (msisdn == null) {
            return input;
        }

        User user = userRepository.getUserByMsisdn(msisdn);
        if (user == null) {
            return input;
        }

        input.put("firstName", user.firstName());
        input.put("lastName", user.lastName());
        return input;
    }
}