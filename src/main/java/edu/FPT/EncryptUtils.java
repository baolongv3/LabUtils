package edu.FPT;

import org.apache.commons.codec.digest.DigestUtils;

public class EncryptUtils {
    
    public static String encryptStringSHA256(String data){
        String encryptedData = DigestUtils.sha256Hex(data);
        return encryptedData;
    }

    public static String encryptStringmd5(String data){
        String encryptedData = DigestUtils.md2Hex(data);
        return encryptedData;
    }
}
