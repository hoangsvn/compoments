package com.github.hoangsvn.compoments.client;



import com.github.hoangsvn.compoments.entitys.*;
import com.github.hoangsvn.compoments.payload.response.ResponseType;
import com.github.hoangsvn.compoments.payload.response.Response_Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(value = "service-image", path = "/api/image")
public interface Service_Client_Image {
    @GetMapping("/all")
    ResponseType<List<Image_Byte>, Response_Message> getAll();

    @PostMapping("/upload")
    ResponseType<Image_Byte, Response_Message> uploadHinhAnh(@RequestParam("file") MultipartFile image, @RequestHeader("Authorization") String authorization);

    @GetMapping("/removeid={id}")
    ResponseType<Response_Message, Response_Message> removeImageByID(@PathVariable String id, @RequestHeader(value = "Authorization") String Authorization);
}
