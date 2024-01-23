package com.github.hoangsvn.compoments.client;


import com.github.hoangsvn.compoments.payload.response.ResponseType;
import com.github.hoangsvn.compoments.payload.response.Response_Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "service-payment", path = "/api/payment")
public interface Service_Client_Payment {
    @GetMapping("/create-bill")
    ResponseType<Response_Message> CreateBill(@RequestHeader(value = "Authorization") String Authorization);


    @GetMapping("/momo-payment")
    ResponseType<Response_Message> Momo_Payment(@RequestHeader(value = "Authorization") String Authorization);


    @GetMapping("/momo-check")
    ResponseType<Response_Message> Momo_check();
    @GetMapping("/vnpay-payment")

    ResponseType<Response_Message> Vnpay_payment(@RequestHeader(value = "Authorization") String Authorization);

    @GetMapping("/vnpay-check")
    ResponseType<Response_Message> Vnpay_check(@RequestHeader(value = "Authorization") String Authorization);

}
