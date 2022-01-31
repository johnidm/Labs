package api.tistech.config.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("test")
@PropertySource("classpath:application-test.properties")
public class TestConfiguration {
}
