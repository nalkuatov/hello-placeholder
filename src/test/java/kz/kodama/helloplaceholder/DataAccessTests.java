package kz.kodama.helloplaceholder;

import kz.kodama.helloplaceholder.domain.Placeholder;
import kz.kodama.helloplaceholder.repository.PlaceholderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DataJpaTest
class DataAccessTests {

    @BeforeEach
    void populate(@Autowired PlaceholderRepository repository) {
        repository.save(new Placeholder("sample"));
    }

    @Test
    void checkIfExists(@Autowired PlaceholderRepository repository) {
        assertEquals(1, repository.count());
    }

    @Test
    void checkPlaceholderProperty(@Autowired PlaceholderRepository repository) {
        assertEquals("sample", repository.findAll().get(0).getValue());
    }

}
