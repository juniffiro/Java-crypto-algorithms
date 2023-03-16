package ua.juniffiro.rsa;

/**
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 * ( Created ) ( by ) ( @juniffiro )
 * 27/02/2023
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 */
public interface Encoder {

    /**
     * Encode an array of bytes.
     *
     * @param bytes
     *        Get an array of bytes from the text string.
     *
     * @return Encoded data array.
     */
    byte[] encode(String bytes);
}
