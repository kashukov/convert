package com.kashukov.convert;

/**
 * Convert byte[] to any primitive data type
 */
public class ByteArray {
    /**
     * Convert byte[] to boolean (first byte in array)
     *
     * @param input byte[]
     * @return boolean
     */
    public static boolean byteArrayToBoolean(byte[] input) {
        return input[0] != 0;
    }

    /**
     * Convert byte[] to byte (first byte in array)
     *
     * @param input byte[]
     * @return byte
     */
    public static byte byteArrayToByte(byte[] input) {
        return input[0];
    }

    /**
     * Convert byte[] to char (first byte in array)
     *
     * @param input byte[]
     * @return char
     */
    public static char byteArrayToChar(byte[] input) {
        return (char) input[0];
    }

    /**
     * Convert byte[] to double (first byte in array)
     *
     * @param input byte[]
     * @return double
     */
    public static double byteArrayToDouble(byte[] input) {
        return (double) input[0];
    }

    /**
     * Convert byte[] to float (first byte in array)
     *
     * @param input byte[]
     * @return float
     */
    public static float byteArrayToFloat(byte[] input) {
        return (float) input[0];
    }

    /**
     * Convert byte[] to int (first byte in array)
     *
     * @param input byte[]
     * @return int
     */
    public static int byteArrayToInt(byte[] input) {
        return (int) input[0];
    }

    /**
     * Convert byte[] to long (first byte in array)
     *
     * @param input byte[]
     * @return long
     */
    public static long byteArrayToLong(byte[] input) {
        return (long) input[0];
    }

    /**
     * Convert byte[] to short (first byte in array)
     *
     * @param input byte[]
     * @return short
     */
    public static short byteArrayToShort(byte[] input) {
        return (short) input[0];
    }

    /**
     * Convert byte[] to String
     *
     * @param input byte[]
     * @return String
     */
    public static String byteArrayToString(byte[] input) {
        return new String(input);
    }
}