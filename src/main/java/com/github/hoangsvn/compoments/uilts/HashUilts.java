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

