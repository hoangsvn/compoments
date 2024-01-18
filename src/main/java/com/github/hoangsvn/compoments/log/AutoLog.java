package com.github.hoangsvn.compoments.log;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.stream.StreamSupport;

@Component
@RequiredArgsConstructor
public class AutoLog extends AppLog {

    private final ApplicationContext applicationContext;

    @PostConstruct
    public void Context() {
        final Environment env = applicationContext.getEnvironment();
        INFO(this.getClass(), CustomBoderString("+", "=", "ENV", 100));
        String[] Filters = {"java", "service", "spring", "server", "eureka", "sun"};

        INFO(AutoLog.class,"FilterKeywords", Arrays.stream(Filters).toList().toString());
        final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();
        StreamSupport.stream(sources.spliterator(), false)
                .filter(ps -> ps instanceof EnumerablePropertySource)
                .map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .filter(prop -> Arrays.stream(Filters).anyMatch(prop::contains))
                .forEach(prop -> INFO(this.getClass(), prop, env.getProperty(prop)));

        INFO(this.getClass(), CustomBoderString("+", "=", "END", 100));
    }
}
