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
        return ReturnError(res);
    }

    @ExceptionHandler(TokenException.class)
    public ResponseEntity<?> appTokenException(TokenException ex) {
        Response_Message responseMessage = Response_Message.builder()
                .message(ex.getMessage())
                .type("App-TokenException")
                .build();
        return ReturnError(responseMessage);
    }

    @ExceptionHandler(AppException.class)
    public ResponseEntity<?> AppException(AppException ex) {
        Response_Message responseMessage = Response_Message.builder()
                .message(ex.getMessage())
                .type("App-Exception")
                .build();
        return ReturnError(responseMessage);
    }

    @ExceptionHandler(MissingFormatWidthException.class)
    public ResponseEntity<?> AppMissingFormatWidthException(MissingFormatWidthException ex) {
        Response_Message responseMessage = Response_Message.builder()
                .message(ex.getMessage())
                .type("App-MissingFormatWidthException")
                .build();
        return ReturnError(responseMessage);
    }

    @ExceptionHandler(Repository_Exception.class)
    public ResponseEntity<?> AppRepository_Exception(Repository_Exception ex) {
        Response_Message responseMessage = Response_Message.builder()
                .message(ex.getMessage())
                .type("App-Repository-Exception")
                .build();
        return ReturnError(responseMessage);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<?> AppNoSuchElementException(NoSuchElementException ex) {
        Response_Message responseMessage = Response_Message.builder()
                .message(ex.getMessage())
                .type("App-NoSuchElementException")
                .build();
        return ReturnError(responseMessage);
    }

}
