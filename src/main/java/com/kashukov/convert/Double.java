package com.kashukov.convert;

/**
 * Convert double to any primitive data type
 */
public class Double {
    /**
     * Convert double to boolean
     *
     * @param input double
     * @return boolean
     */
    public static boolean doubleToBoolean(double input) {
        return input != 0.0;
    }

    /**
     * Convert double to byte
     *
     * @param input double
     * @return byte
     */
    public static byte doubleToByte(double input) {
        return (byte) input;
    }

    /**
     * Convert double to byte[]
     *
     * @param input double
     * @return byte[]
     */
    public static byte[] doubleToByteArray(double input) {
        return new byte[]{
                (byte) input
        };
    }

    /**
     * Convert double to char
     *
     * @param input double
     * @return char
     */
    public static double doubleToChar(double input) {
        return (char) input;
    }

    /**
     * Convert double to float
     *
     * @param input double
     * @return float
     */
    public static float doubleToFloat(double input) {
        return (float) input;
    }

    /**
     * Convert double to int
     *
     * @param input double
     * @return int
     */
    public static int doubleToInt(double input) {
        return (int) input;
    }

    /**
     * Convert double to long
     *
     * @param input double
     * @return long
     */
    public static long doubleToLong(double input) {
        return (long) input;
    }

    /**
     * Convert double to short
     *
     * @param input double
     * @return short
     */
    public static short doubleToShort(double input) {
        return (short) input;
    }

    /**
     * Convert double to String
     *
     * @param input double
     * @return String
     */
    public static String doubleToString(double input) {
        return java.lang.Double.toString(input);
    }
}