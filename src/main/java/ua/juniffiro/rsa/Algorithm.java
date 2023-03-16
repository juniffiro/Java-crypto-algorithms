package ua.juniffiro.rsa;

/**
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 * ( Created ) ( by ) ( @juniffiro )
 * 27/02/2023
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 */
public interface Algorithm {

    /**
     * Creates public and private key.
     */
    KeyGen getKeyGen();

    /**
     * Encoder data.
     */
    Encoder getEncoder();

    /**
     * Decoder data.
     */
    Decoder getDecoder();
}
