package api.tistech.loader;

import api.tistech.model.User;
import api.tistech.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserLoader implements InitializingBean {

    public final UserRepository repository;

    public UserLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional()
    public void afterPropertiesSet() {
        List<User> users = new ArrayList<>(Arrays.asList(
                User.builder().name("Patricia").build(),
                User.builder().name("Jennifer").build(),
                User.builder().name("Robert").build()
        ));

        repository.saveAll(users);
    }
}
