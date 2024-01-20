package com.github.hoangsvn.compoments.client;

import com.github.hoangsvn.compoments.payload.response.ResponseType;
import com.github.hoangsvn.compoments.payload.response.Response_Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-product", path = "/api/product")
public interface Service_Client_Product {
    @GetMapping("/test")
    ResponseType<Response_Message, Response_Message> Test();
}
