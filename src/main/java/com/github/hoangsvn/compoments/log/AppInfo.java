package com.github.hoangsvn.compoments.log;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.stream.StreamSupport;

@Component
@RequiredArgsConstructor
public class AppInfo extends Log {

//    @EventListener
//    public void handleContextRefresh(ContextRefreshedEvent event) {
//        final Environment env = event.getApplicationContext().getEnvironment();
//        INFO(AppInfo.class, CustomBoderString("+", "=", "ENV", 80));
//        INFO(AppInfo.class, "Active profiles:", String.valueOf(env.getActiveProfiles().length));
//        final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();
//        StreamSupport.stream(sources.spliterator(), false)
//                .filter(ps -> ps instanceof EnumerablePropertySource)
//                .map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
//                .flatMap(Arrays::stream)
//                .distinct()
//                .sorted()
//                .filter(prop -> (prop.contains("java") || prop.contains("service") || prop.contains("spring") || prop.contains("server") || prop.contains("eureka") || prop.contains("sun")))
//                .forEach(prop -> INFO(AppInfo.class, prop, env.getProperty(prop)));
//
//        INFO(AppInfo.class, CustomBoderString("+", "=", "END", 80));
//    }

    private final ApplicationContext applicationContext;

    @PostConstruct
    public void Context() {
        final Environment env = applicationContext.getEnvironment();
        INFO(AppInfo.class, CustomBoderString("+", "=", "ENV", 100));
        INFO(AppInfo.class, "Active profiles:", String.valueOf(env.getActiveProfiles().length));
        final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();
        StreamSupport.stream(sources.spliterator(), false)
                .filter(ps -> ps instanceof EnumerablePropertySource)
                .map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .filter(prop -> (prop.contains("java") || prop.contains("service") || prop.contains("spring") || prop.contains("server") || prop.contains("eureka") || prop.contains("sun")))
                .forEach(prop -> INFO(AppInfo.class, prop, env.getProperty(prop)));

        INFO(AppInfo.class, CustomBoderString("+", "=", "END", 100));
    }
}
