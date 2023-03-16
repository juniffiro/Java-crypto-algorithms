package ua.juniffiro.rsa;

import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;

/**
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 * ( Created ) ( by ) ( @juniffiro )
 * 27/02/2023
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 */
public class RSA extends KeyGen implements Algorithm {

    private final Encoder encoder = new Encoder() {
        @Override
        public byte[] encode(String bytes) {
            Cipher rsa;
            try {
                rsa = Cipher.getInstance(getAlgorithm());
                rsa.init(Cipher.ENCRYPT_MODE, getPublicKey());
                return rsa.doFinal(bytes.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new byte[0];
        }
    };

    private final Decoder decoder = new Decoder() {
        @Override
        public byte[] decode(byte[] bytes) {
            Cipher rsa;
            try {
                rsa = Cipher.getInstance(getAlgorithm());
                rsa.init(Cipher.DECRYPT_MODE, getPrivateKey());
                return rsa.doFinal(bytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new byte[0];
        }

        @Override
        public String decodeToString(byte[] bytes) {
            return new String(bytes);
        }
    };

    public RSA() throws NoSuchAlgorithmException {
        super("RSA");
    }

    public RSA(int keySize) throws NoSuchAlgorithmException {
        super("RSA", keySize);
    }

    @Override
    public KeyGen getKeyGen() {
        return this;
    }

    @Override
    public Encoder getEncoder() {
        return encoder;
    }

    @Override
    public Decoder getDecoder() {
        return decoder;
    }
}
