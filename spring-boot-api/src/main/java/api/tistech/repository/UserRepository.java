package api.tistech.repository;

import org.springframework.data.repository.CrudRepository;
import api.tistech.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    Iterable<User> findByNameContaining(String name);
}
