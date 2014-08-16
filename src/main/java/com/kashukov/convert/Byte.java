package com.kashukov.convert;

/**
 * Convert byte to any primitive data type.
 */
public class Byte {
    /**
     * Convert byte to boolean
     *
     * @param input byte
     * @return boolean
     */
    public static boolean byteToBoolean(byte input) {
        return input != 0;
    }

    /**
     * Convert byte to byte[]
     *
     * @param input byte
     * @return byte[]
     */
    public static byte[] byteToByteArray(byte input) {
        return new byte[]{input};
    }

    /**
     * Convert byte to char
     *
     * @param input byte
     * @return char
     */
    public static char byteToChar(byte input) {
        return (char) input;
    }

    /**
     * Convert byte to double
     *
     * @param input byte
     * @return double
     */
    public static double byteToDouble(byte input) {
        return (double) input;
    }

    /**
     * Convert byte to float
     *
     * @param input byte
     * @return float
     */
    public static float byteToFloat(byte input) {
        return (float) input;
    }

    /**
     * Convert byte to int
     *
     * @param input byte
     * @return int
     */
    public static int byteToInt(byte input) {
        return (int) input;
    }

    /**
     * Convert byte to long
     *
     * @param input byte
     * @return long
     */
    public static long byteToLong(byte input) {
        return (long) input;
    }

    /**
     * Convert byte to short
     *
     * @param input byte
     * @return short
     */
    public static short byteToShort(byte input) {
        return (short) input;
    }

    /**
     * Convert byte to String
     *
     * @param input byte
     * @return String
     */
    public static java.lang.String byteToString(byte input) {
        return java.lang.Byte.toString(input);
    }
}