package com.github.hoangsvn.compoments.uilts;


import org.apache.commons.codec.binary.Hex;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class HashUilts {
    public static String hmacSha256(String secretKey, String data)  {
        String Algorithm = "HmacSHA256";
        return HmacAlgorithm(Algorithm,secretKey,data);
    }
    public static String hmacSha512(String secretKey, String data)  {
        String Algorithm = "HmacSHA512";
        return HmacAlgorithm(Algorithm,secretKey,data);

    }

    public static String HmacAlgorithm(String algorithm,String secretKey, String data){
        try {
            Mac hmac = Mac.getInstance(algorithm);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), algorithm);
            hmac.init(secretKeySpec);
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            byte[] signatureBytes = hmac.doFinal(dataBytes);
            String signature = Hex.encodeHexString(signatureBytes);
            return signature.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
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

    public static String hashAllFields(String HashSecret,Map fields) {
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
    public static String Sha256(String message) {
        return MessageDigestAlgorithm("SHA-256",message);
    }
    public static String md5(String message) {
        return MessageDigestAlgorithm("MD5",message);
    }
    public static String MessageDigestAlgorithm(String Algorithm,String message) {

        try {
            MessageDigest md = MessageDigest.getInstance(Algorithm);
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            return Hex.encodeHexString(hash);
        } catch (Exception ex) {
            return null;
        }
    }
}

