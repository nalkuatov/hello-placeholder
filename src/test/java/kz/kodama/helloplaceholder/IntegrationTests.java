package kz.kodama.helloplaceholder;

import kz.kodama.helloplaceholder.domain.Placeholder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class IntegrationTests {

    @Test
    void checkGetRequest(@Autowired TestRestTemplate template) throws Exception {
        ResponseEntity<Placeholder> r = template.getForEntity("/placeholders/1", Placeholder.class);
        assertEquals("Hello World!", r.getBody().getValue());
    }
}
