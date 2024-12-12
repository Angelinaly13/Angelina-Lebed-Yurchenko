package dz5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.Map;

public class EnrichmentServiceTest {
    @Test
    void testBasicEnrichment() {
        MapUserRepository repository = new MapUserRepository();
        repository.saveOrUpdateUser("89528120000", new User("Username", "Usernamov"));

        EnrichmentService service = new EnrichmentService();
        service.registerEnrichment(Message.EnrichmentType.MSISDN, new MsisdnEnrichment(repository));

        Message inputMessage = new Message(
                Map.of("user", "test", "msisdn", "89528120000"),
                Message.EnrichmentType.MSISDN);

        Message expectedMessage = new Message(
                Map.of(
                        "user", "test",
                        "msisdn", "89528120000",
                        "firstName", "Username",
                        "lastName", "Usernamov"),
                Message.EnrichmentType.MSISDN);

        assertEquals(expectedMessage, service.applyEnrichment(inputMessage));
    }

    @Test
    void testNoEnrichmentFound() {
        EnrichmentService service = new EnrichmentService();

        Message inputMessage = new Message(
                Map.of("test", "test"),
                Message.EnrichmentType.MSISDN);

        assertEquals(inputMessage, service.applyEnrichment(inputMessage));
    }
}