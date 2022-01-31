package api.tistech.controllers;

import api.tistech.model.User;
import api.tistech.repository.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(tags = "Users")
@RequestMapping(path = "/user")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getUser(@PathVariable int id) {
        return repository
                .findById(id).map(data -> ResponseEntity.ok().body(data))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/search")
    public ResponseEntity searchBy(@RequestParam Map<String,String> allParams) {

        String name = allParams.get("name");
        if (!Objects.isNull(name)){
            return ResponseEntity.ok().body(repository.findByNameContaining(name));
        }

        return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList() );
    }

    @PostMapping(path = "")
    public ResponseEntity createUser(@RequestBody User body) {
        User user = new User();
        user.setName(body.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(
            @PathVariable("id") int id,
            @RequestBody User body) {

        return repository.findById(id).map(data -> {
            data.setName(body.getName());
            return ResponseEntity.ok().body(repository.save(data));
        }).orElse(ResponseEntity.notFound().build());

    }

    @DeleteMapping(path = { "/{id}" })
    public ResponseEntity delete(@PathVariable int id) {
        return repository.findById(id)
                .map(data -> {
                    repository.deleteById(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
