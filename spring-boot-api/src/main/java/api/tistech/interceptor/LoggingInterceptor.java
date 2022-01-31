package api.tistech.interceptor;

import api.tistech.service.LoggingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import java.util.Objects;
import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class LoggingInterceptor implements HandlerInterceptor {

    private final LoggingService service;

    public LoggingInterceptor(LoggingService service) {
        this.service = service;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String action = "Request-" + request.getMethod();
        String url = request.getRequestURL().toString();
        Integer statusCode = response.getStatus();

        String username = null;

        Principal principal = request.getUserPrincipal();
        if (!Objects.isNull(principal)) {
            username = principal.getName();
        }

        service.log(username, action.toLowerCase(), url, statusCode);

        return true;
    }

}