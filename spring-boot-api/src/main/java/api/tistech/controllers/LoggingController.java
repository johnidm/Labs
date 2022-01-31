package api.tistech.controllers;

import api.tistech.repository.LoggingRepository;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Logs")
@RequestMapping(path = "/logging")
public class LoggingController {
    private final LoggingRepository repository;

    public LoggingController(LoggingRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/all")
    public ResponseEntity getAllLogs() {
        return ResponseEntity.ok().body(repository.findAll());
    }
}
