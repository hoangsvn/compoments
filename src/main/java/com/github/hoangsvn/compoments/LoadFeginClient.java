package com.github.hoangsvn.compoments;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@EnableFeignClients(basePackages = "com.github.hoangsvn.compoments.client")
@EnableCaching
public class LoadFeginClient {
}
