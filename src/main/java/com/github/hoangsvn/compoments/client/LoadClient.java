package com.github.hoangsvn.compoments.client;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.github.hoangsvn.compoments.client")
@EnableCaching
public class LoadClient {
}
