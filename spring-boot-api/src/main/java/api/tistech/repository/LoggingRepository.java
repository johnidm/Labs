package api.tistech.repository;

import org.springframework.data.repository.CrudRepository;
import api.tistech.model.Logging;

public interface LoggingRepository extends CrudRepository<Logging, Integer> {
}