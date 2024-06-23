package com.github.hoangsvn.compoments.client;

import com.github.hoangsvn.compoments.entitys.storage.StorageFile;
import com.github.hoangsvn.compoments.payload.response.ResponseType;
import com.github.hoangsvn.compoments.payload.response.Response_Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(value = "service-storage", path = "/api/storage")
public interface Service_Client_Storage {
    @GetMapping("/all")
    ResponseType<List<StorageFile>> getAll();

    @PostMapping("/upload")
    ResponseType<StorageFile> uploadHinhAnh(@RequestParam("file") MultipartFile image, @RequestHeader("Authorization") String authorization);

    @GetMapping("/removeid={id}")
    ResponseType<Response_Message> removeImageByID(@PathVariable String id, @RequestHeader(value = "Authorization") String Authorization);
}
