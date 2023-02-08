package com.learning.crypto.symmetric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import javax.xml.bind.DatatypeConverter;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SymmetricEncryptionUtilsTest {

    @Test
    void createAESKey() throws Exception {
        SecretKey key = SymmetricEncryptionUtils.createAESKey();
        assertNotNull(key);

        System.out.println(DatatypeConverter.printHexBinary(key.getEncoded()));
    }

    @Test
    void testAESCryptoRoutine() throws Exception {
        SecretKey key = SymmetricEncryptionUtils.createAESKey();
        byte[] initializationVector = SymmetricEncryptionUtils.creatInitializationVector();
        String plainText = "This is the plain text";

        // encrypt plain text to cipher text
        byte[] cipherText = SymmetricEncryptionUtils.performAESEncryption(plainText, key, initializationVector);
        Assertions.assertNotNull(cipherText);

        // Decrypt cipher text back to plain text
        String decryptedText = SymmetricEncryptionUtils.performAESDecryption(cipherText, key, initializationVector);

        // Assert the decrypted text and plain text are same
        Assertions.assertEquals(plainText, decryptedText);
    }
}