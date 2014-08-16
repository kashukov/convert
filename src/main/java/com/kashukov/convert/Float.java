package com.kashukov.convert;

/**
 * Convert float to any primitive data type
 */
public class Float {
    /**
     * Convert float to boolean
     *
     * @param input float
     * @return boolean
     */
    public static boolean floatToBoolean(float input) {
        return input != 0.0f;
    }

    /**
     * Convert float to byte
     *
     * @param input float
     * @return byte
     */
    public static byte floatToByte(float input) {
        return (byte) input;
    }

    /**
     * Convert float to byte[]
     *
     * @param input float
     * @return byte[]
     */
    public static byte[] floatToByteArray(float input) {
        return new byte[]{
                (byte) input
        };
    }

    /**
     * Convert float to char
     *
     * @param input float
     * @return char
     */
    public static char floatToChar(float input) {
        return (char) input;
    }

    /**
     * Convert float to double
     *
     * @param input float
     * @return double
     */
    public static double floatToDouble(float input) {
        return (double) input;
    }

    /**
     * Convert float to int
     *
     * @param input float
     * @return int
     */
    public static int floatToInt(float input) {
        return (int) input;
    }

    /**
     * Convert float to long
     *
     * @param input float
     * @return long
     */
    public static long floatToLong(float input) {
        return (long) input;
    }

    /**
     * Convert float to short
     *
     * @param input float
     * @return short
     */
    public static short floatToShort(float input) {
        return (short) input;
    }

    /**
     * Convert float to String
     *
     * @param input float
     * @return String
     */
    public static java.lang.String floatToString(float input) {
        return java.lang.Float.toString(input);
    }
}