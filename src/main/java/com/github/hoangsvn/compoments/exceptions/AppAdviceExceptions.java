package com.github.hoangsvn.compoments.exceptions;

import com.github.hoangsvn.compoments.payload.response.MyResponse;
import com.github.hoangsvn.compoments.payload.response.Response_Message;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingFormatWidthException;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class AppAdviceExceptions extends MyResponse {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> appMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, String> res = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(Error -> {
            res.put(((FieldError) Error).getField(), Error.getDefaultMessage());
        });
        return ResponseEntity.badRequest()
                .body(Response_Data_Message(
                        res,
                        rest_controller_fail));
    }

    @ExceptionHandler(TokenException.class)
    public ResponseEntity<?> appTokenException(TokenException ex) {
        return ResponseEntity.badRequest()
                .body(Response_Data_Message(
                        Response_Message
                                .builder()
                                .message(ex.getMessage())
                                .type("App-TokenException")
                                .success(false)
                                .build(), rest_controller_fail)
                );
    }

    @ExceptionHandler(AppException.class)
    public ResponseEntity<?> AppException(AppException ex) {
        return ResponseEntity.badRequest()
                .body(Response_Data_Message(
                        Response_Message
                                .builder()
                                .message(ex.getMessage())
                                .type("App-Exception")
                                .success(false)
                                .build(), rest_controller_fail)
                );
    }

    @ExceptionHandler(MissingFormatWidthException.class)
    public ResponseEntity<?> AppMissingFormatWidthException(MissingFormatWidthException ex) {
        return ResponseEntity.badRequest()
                .body(Response_Data_Message(
                        Response_Message
                                .builder()
                                .message(ex.getMessage())
                                .type("App-MissingFormatWidthException")
                                .success(false)
                                .build(), rest_controller_fail)
                );
    }

    @ExceptionHandler(Repository_Exception.class)
    public ResponseEntity<?> AppRepository_Exception(Repository_Exception ex) {
        return ResponseEntity.badRequest()
                .body(Response_Data_Message(
                        Response_Message
                                .builder()
                                .message(ex.getMessage())
                                .type("App-Repository_Exception")
                                .success(false)
                                .build(), rest_controller_fail)
                );
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<?> AppNoSuchElementException(NoSuchElementException ex) {
        return ResponseEntity.badRequest()
                .body(Response_Data_Message(
                        Response_Message
                                .builder()
                                .message(ex.getMessage())
                                .type("App-NoSuchElementException")
                                .success(false)
                                .build(), rest_controller_fail)
                );
    }

}
