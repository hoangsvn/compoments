package com.github.hoangsvn.compoments;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan(basePackages = {"com.github.hoangsvn.compoments","com.github.hoangsvn.compoments.exceptions"})
@EnableCaching
public @interface LoadMyCompoments {
}
