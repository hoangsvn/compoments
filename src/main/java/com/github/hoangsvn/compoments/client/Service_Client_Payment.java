package com.github.hoangsvn.compoments.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "payment-service", path = "/api/payment")
public interface Service_Client_Payment {
}
