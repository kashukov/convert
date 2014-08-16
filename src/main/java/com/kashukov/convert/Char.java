package com.kashukov.convert;

/**
 * Convert char to any primitive data type
 */
public class Char {
    /**
     * Convert char to boolean
     *
     * @param input char
     * @return boolean
     */
    public static boolean charToBoolean(char input) {
        return input != 0;
    }

    /**
     * Convert char to byte
     *
     * @param input char
     * @return byte
     */
    public static byte charToByte(char input) {
        return (byte) input;
    }

    /**
     * Convert char to byte[]
     *
     * @param input char
     * @return byte[]
     */
    public static byte[] charToByteArray(char input) {
        return new byte[]{
                (byte) input
        };
    }

    /**
     * Convert char to double
     *
     * @param input char
     * @return double
     */
    public static double charToDouble(char input) {
        return (double) input;
    }

    /**
     * Convert char to float
     *
     * @param input char
     * @return float
     */
    public static float charToFloat(char input) {
        return (float) input;
    }

    /**
     * Convert char to int
     *
     * @param input char
     * @return int
     */
    public static int charToInt(char input) {
        return (int) input;
    }

    /**
     * Convert char to long
     *
     * @param input char
     * @return long
     */
    public static long charToLong(char input) {
        return (long) input;
    }

    /**
     * Convert char to short
     *
     * @param input char
     * @return short
     */
    public static short charToShort(char input) {
        return (short) input;
    }

    /**
     * Convert char to String
     *
     * @param input char
     * @return String
     */
    public static String charToString(char input) {
        return Character.toString(input);
    }
}