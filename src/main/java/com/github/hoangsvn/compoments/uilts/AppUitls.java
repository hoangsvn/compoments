package com.github.hoangsvn.compoments.uilts;

import com.github.hoangsvn.compoments.log.AppLog;
import com.github.hoangsvn.compoments.payload.response.ResponseType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class AppUitls extends AppLog {

    public static ResponseEntity<?> ReturnDataMessage(int statuscode, Object data, boolean status) {
        return ResponseEntity.status(statuscode).body(ResponseType.builder()
                .data(data)
                .status(status)
                .build());
    }

    public static ResponseEntity<?> ReturnDataMessage(HttpStatus statuscode, Object data, boolean status) {
        return ResponseEntity.status(statuscode).body(ResponseType.builder()
                .data(data)
                .status(status)
                .build());
    }

    public static ResponseEntity<?> ReturnSuccess(Object data) {
        return ReturnDataMessage(HttpStatus.OK, data, true);
    }

    public static ResponseEntity<?> ReturnError(Object data) {
        return ReturnDataMessage(HttpStatus.BAD_REQUEST, data, false);
    }

    public static ResponseEntity<?> ReturnNotFound(Object data) {
        return ReturnDataMessage(HttpStatus.NOT_FOUND, data, false);
    }

    public static String RamdomFileName(String type) {
        return DateToString() + "-" + Ramdomkey() + "-" + Ramdomkey() + "." + type;
    }

    public static String Ramdomkey() {
        return UUID.randomUUID().toString();
    }

    public static String DateToString() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-sss").format(new Date());
    }
}
