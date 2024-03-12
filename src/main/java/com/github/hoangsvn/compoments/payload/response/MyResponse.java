package com.github.hoangsvn.compoments.payload.response;

import com.github.hoangsvn.compoments.log.AppLog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class MyResponse extends AppLog {


    public ResponseEntity<?> ReturnDataMessage(int statuscode, Object data, boolean status) {
        return ResponseEntity.status(statuscode).body(ResponseType.builder()
                .data(data)
                .status(status)
                .build());
    }

    public ResponseEntity<?> ReturnDataMessage(HttpStatus statuscode, Object data, boolean status) {
        return ResponseEntity.status(statuscode).body(ResponseType.builder()
                .data(data)
                .status(status)
                .build());
    }

    public ResponseEntity<?> ReturnSuccess(Object data) {
        return ReturnDataMessage(HttpStatus.OK, data, true);
    }

    public ResponseEntity<?> ReturnError(Object data) {
        return ReturnDataMessage(HttpStatus.BAD_REQUEST, data, false);
    }

    public ResponseEntity<?> ReturnNotFound(Object data) {
        return ReturnDataMessage(HttpStatus.NOT_FOUND, data, false);
    }

    public String RamdomNameImage(String type) {
        return DateToString() + "-" + Ramdomkey() + "-" + Ramdomkey() + "." + type;
    }

    public String Ramdomkey() {
        return UUID.randomUUID().toString();
    }

    public String DateToString() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-sss").format(new Date());
    }

    public final static Response_Message rest_controller_fail = new Response_Message("REST Controller Fail ! ", "Controller");
    public final static Response_Message rest_controller_success = new Response_Message("REST Controller Succeess !", "Controller");
    public final static Response_Message rest_controller_error = new Response_Message("REST Controller Error !", "Controller");
    public final static Response_Message rest_please_login = new Response_Message("The invoice creation service encountered an error, please try again !", "Controller");
    public final static Response_Message rest_not_found_database = new Response_Message("That was not found in the database , please try again !", "Controller");
    public final static Response_Message rest_delete_success = new Response_Message("Deleted successfully !", "Controller");
    public final static Response_Message rest_delete_error = new Response_Message("Deleted error !", "Controller");
    public final static Response_Message rest_controller_exception = new Response_Message("A service exception occurred, please try again !", "Exception");
    public final static Response_Message rest_controller_unable_token = new Response_Message("Unable to authenticate user via token, please try again", "Exception");
    public final static Response_Message rest_controller_upload_exception = new Response_Message("An exception occurred while the upload failed, please try again", "Exception");
}
