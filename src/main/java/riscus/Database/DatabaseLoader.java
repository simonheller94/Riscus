package riscus.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import riscus.Models.Station;
import riscus.Repositories.StationRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final StationRepository repository;

    @Autowired
    public DatabaseLoader(StationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Station("Winterthur", 47.49882f, 8.723689f));
    }
}
