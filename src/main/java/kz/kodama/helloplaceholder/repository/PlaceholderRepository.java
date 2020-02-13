package kz.kodama.helloplaceholder.repository;

import kz.kodama.helloplaceholder.domain.Placeholder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceholderRepository extends JpaRepository<Placeholder, Long> {
}
