package com.kashukov.convert;

/**
 * Convert int to any primitive data type
 */
public class Int {
    /**
     * Convert int to boolean
     *
     * @param input int
     * @return boolean
     */
    public static boolean intToBoolean(int input) {
        return input != 0;
    }

    /**
     * Convert int to byte
     *
     * @param input int
     * @return byte
     */
    public static byte intToByte(int input) {
        return (byte) input;
    }

    /**
     * Convert int to byte[]
     *
     * @param input int
     * @return byte[]
     */
    public static byte[] intToByteArray(int input) {
        return new byte[]{
                (byte) (input >>> 24),
                (byte) (input >>> 16),
                (byte) (input >>> 8),
                (byte) input};
    }

    /**
     * Convert int to char
     *
     * @param input int
     * @return char
     */
    public static char intToChar(int input) {
        return (char) input;
    }

    /**
     * Convert int to double
     *
     * @param input int
     * @return double
     */
    public static double intToDouble(int input) {
        return (double) input;
    }

    /**
     * Convert int to float
     *
     * @param input int
     * @return float
     */
    public static float intToInt(int input) {
        return (float) input;
    }

    /**
     * Convert int to long
     *
     * @param input int
     * @return long
     */
    public static long intToLong(int input) {
        return (long) input;
    }

    /**
     * Convert int to short
     *
     * @param input int
     * @return short
     */
    public static short intToShort(int input) {
        return (short) input;
    }

    /**
     * Convert int to String
     *
     * @param input int
     * @return String
     */
    public static String intToString(int input) {
        return java.lang.Integer.toString(input);
    }
}