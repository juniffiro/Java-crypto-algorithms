package ua.juniffiro.rsa.test;

import org.junit.jupiter.api.Test;
import ua.juniffiro.rsa.Algorithm;
import ua.juniffiro.rsa.RSA;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 * ( Created ) ( by ) ( @juniffiro )
 * 27/02/2023
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 */
public class RSATest {

    @Test
    public void testRsa() throws NoSuchAlgorithmException {
        String test = "Hello world!";

        Algorithm rsa = new RSA(2048);

        byte[] encode = rsa.getEncoder().encode(test);
        byte[] decode = rsa.getDecoder().decode(encode);

        String decodeString = rsa.getDecoder().decodeToString(decode);

        System.out.println(decodeString);

        assertEquals(test, decodeString);
    }
}
