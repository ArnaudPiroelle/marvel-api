package fr.apir.marvel.api.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Piroelle on 04/03/14.
 */
public class MD5Util {
    public static String hash(String publicApiKey, String privateApiKey, String timestamp) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            String toHash = timestamp + privateApiKey + publicApiKey;
            return new BigInteger(1, md.digest(toHash.getBytes())).toString(16);
        } catch (NoSuchAlgorithmException e) {
            // TODO :Gestion de l'exception
        }
        return null;
    }
}
