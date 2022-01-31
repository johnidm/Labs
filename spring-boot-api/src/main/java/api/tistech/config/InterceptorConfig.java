package api.tistech.config;

import api.tistech.interceptor.LoggingInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    private final LoggingInterceptor inperceptor;

    public InterceptorConfig(LoggingInterceptor inperceptor) {
        this.inperceptor = inperceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(inperceptor);
    }

}