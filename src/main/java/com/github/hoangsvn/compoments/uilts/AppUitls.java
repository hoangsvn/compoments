package com.github.hoangsvn.compoments.uilts;

import com.github.hoangsvn.compoments.log.AppLog;
import com.github.hoangsvn.compoments.payload.response.ResponseType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.github.hoangsvn.compoments.uilts.HashUilts.hmacSha512;

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



    public static String hashAllFields(String HashSecret, Map fields) {
        List fieldNames = new ArrayList(fields.keySet());
        Collections.sort(fieldNames);
        StringBuilder sb = new StringBuilder();
        Iterator itr = fieldNames.iterator();
        while (itr.hasNext()) {
            String fieldName = (String) itr.next();
            String fieldValue = (String) fields.get(fieldName);
            if ((fieldValue != null) && (fieldValue.length() > 0)) {
                sb.append(fieldName);
                sb.append("=");
                sb.append(fieldValue);
            }
            if (itr.hasNext()) {
                sb.append("&");
            }
        }
        return hmacSha512(HashSecret,sb.toString());
    }
    public static String getResponseFromEnpoint(String Method, String endpoint, String jsonData) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod(Method);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Content-Length", String.valueOf(jsonData.length()));
            OutputStream os = conn.getOutputStream();
            os.write(jsonData.getBytes());
            os.flush();
            os.close();
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                StringBuilder response = new StringBuilder();
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                return  response.toString();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public static String getRandomNumber(int len) {
        Random rnd = new Random();
        String chars = "0123456789";
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return sb.toString();
    }
    public static String Ramdomkey() {
        return UUID.randomUUID().toString();
    }

    public static String DateToString() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-sss").format(new Date());
    }
}
