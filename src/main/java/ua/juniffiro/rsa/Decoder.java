package ua.juniffiro.rsa;

/**
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 * ( Created ) ( by ) ( @juniffiro )
 * 27/02/2023
 * +-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+
 */
public interface Decoder {

    /**
     * Decode data from encoded byte array.
     *
     * @param bytes
     *        Encoded data array.
     *
     * @return Decoded data array.
     */
    byte[] decode(byte[] bytes);

    /**
     * Decode array of bytes to string.
     *
     * @param bytes
     *        Encoded data array.
     *
     * @return Decoded data string.
     */
    String decodeToString(byte[] bytes);
}
