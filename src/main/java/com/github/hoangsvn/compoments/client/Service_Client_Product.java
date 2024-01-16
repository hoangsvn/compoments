package com.github.hoangsvn.compoments.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "product-service", path = "/api/product")
public interface Service_Client_Product {
}
