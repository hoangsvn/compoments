package com.github.hoangsvn.compoments.payload.response;

import com.github.hoangsvn.compoments.log.AppLog;
import com.github.hoangsvn.compoments.log.AutoLog;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class MyResponse extends AppLog  {



    public ResponseType Response_Data_Message(Object data, Object message){

        return  ResponseType.builder()
                .data(data)
                .message(message)
                .build();
    }
    public String RamdomNameImage(String type) {
        return DateToString()+ "-" + Ramdomkey()+"-"+ Ramdomkey() + "."+type;
    }

    public  String Ramdomkey() {
        return UUID.randomUUID().toString();
    }

    public  String DateToString() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-sss").format(new Date());
    }
    public static Response_Message rest_controller_fail 	= new Response_Message("REST Controller Fail !", 		"Controller Fail"		, false);
    public static Response_Message rest_controller_success	= new Response_Message("REST Controller Succeess !",	"Controller Success"	, true);
    public static Response_Message rest_controller_error 	= new Response_Message("REST Controller Error !", 		"Controller Error"		, false);


    public final String please_login        ="The invoice creation service encountered an error, please try again !";

    public final String not_found_database  ="That was not found in the database , please try again !";

}
