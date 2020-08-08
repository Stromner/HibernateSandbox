package sandbox;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEntryRepository extends JpaRepository<BaseEntry, Long> {
}
