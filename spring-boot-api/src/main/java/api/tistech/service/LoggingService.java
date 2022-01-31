package api.tistech.service;

import api.tistech.model.Logging;
import api.tistech.repository.LoggingRepository;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    private final LoggingRepository repository;

    public LoggingService(LoggingRepository repository) {
        this.repository = repository;
    }

    public void log(String username, String action, String url, Integer statusCode) {
        Logging model = new Logging();

        model.setUsername(username);
        model.setAction(action);
        model.setUrl(url);
        model.setStatusCode(statusCode);

        repository.save(model);
    }
}
