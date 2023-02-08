package com.learning.crypto.asymmetric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.DatatypeConverter;
import java.security.KeyPair;

class AsymmetricEncryptionUtilsTest {

    @Test
    void generateRSAKeyPair() throws Exception {
        KeyPair keyPair = AsymmetricEncryptionUtils.generateRSAKeyPair();
        Assertions.assertNotNull(keyPair);

        System.out.println("Private Key: "
                + DatatypeConverter.printHexBinary(keyPair.getPrivate().getEncoded())
                + "\nPublic Key: " + DatatypeConverter.printHexBinary((keyPair.getPublic().getEncoded())));
    }

    @Test
    void testRSACryptoRoutine() throws Exception {
        KeyPair keyPair = AsymmetricEncryptionUtils.generateRSAKeyPair();
        String plainText = "This is the plain text";
        // encryption
        byte[] cipherText = AsymmetricEncryptionUtils.performRSAEncryption(plainText, keyPair.getPrivate());
        Assertions.assertNotNull(cipherText);

        System.out.println(DatatypeConverter.printHexBinary(cipherText));

        // decryption
        String decryptedText = AsymmetricEncryptionUtils.performRSADecryption(cipherText, keyPair.getPublic());

        Assertions.assertEquals(plainText, decryptedText);
    }
}