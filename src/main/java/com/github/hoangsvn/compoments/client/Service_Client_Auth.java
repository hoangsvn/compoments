package com.github.hoangsvn.compoments.client;

import com.github.hoangsvn.compoments.entitys.*;
import com.github.hoangsvn.compoments.payload.response.ResponseType;
import com.github.hoangsvn.compoments.payload.response.Response_Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "service-auth",path = "/api/auth")
public interface Service_Client_Auth {
    @GetMapping( path = "/info")
    ResponseType<User, Response_Message> findUserInfo(@RequestHeader("Authorization") String authorization ) ;

    @GetMapping( path = "/publicinfo/id={id}")
    ResponseType<User,Response_Message > findPublicUserInfo(@PathVariable String id) ;
}
