package com.github.hoangsvn.compoments;


import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.github.hoangsvn.compoments.log","com.github.hoangsvn.compoments.exceptions"})
@EnableCaching
public class LoadCompoments {
}
