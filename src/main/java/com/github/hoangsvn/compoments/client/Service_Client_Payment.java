package com.github.hoangsvn.compoments.client;


import com.github.hoangsvn.compoments.entitys.User;
import com.github.hoangsvn.compoments.payload.response.ResponseType;
import com.github.hoangsvn.compoments.payload.response.Response_Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "payment-service", path = "/api/payment")
public interface Service_Client_Payment {
    @GetMapping("/create-bill")
    ResponseType<Response_Message, Response_Message> CreateBill(@RequestHeader(value = "Authorization") String Authorization);


    @GetMapping("/momo-payment")
    ResponseType<Response_Message, Response_Message> Vnpay_payment(@RequestHeader(value = "Authorization") String Authorization);


    @GetMapping("/momo-check")
    ResponseType<Response_Message, Response_Message> Vnpay_check();

}
