package kz.kodama.helloplaceholder.component;

import kz.kodama.helloplaceholder.domain.Placeholder;
import kz.kodama.helloplaceholder.repository.PlaceholderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ResourceLoader implements CommandLineRunner {

    private final PlaceholderRepository repository;

    public ResourceLoader(PlaceholderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Placeholder("Hello World!"));
    }
}
