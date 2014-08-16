package com.kashukov.convert;

/**
 * Convert long to any primitive data type
 */
public class Long {
    /**
     * Convert long to boolean
     *
     * @param input long
     * @return boolean
     */
    public static boolean longToBoolean(long input) {
        return input != 0;
    }

    /**
     * Convert long to byte
     *
     * @param input long
     * @return byte
     */
    public static byte longToByte(long input) {
        return (byte) input;
    }

    /**
     * Convert long to byte[]
     *
     * @param input long
     * @return byte[]
     */
    public static byte[] longToByteArray(long input) {
        return new byte[]{
                (byte) (input >>> 56),
                (byte) (input >>> 48),
                (byte) (input >>> 40),
                (byte) (input >>> 32),
                (byte) (input >>> 24),
                (byte) (input >>> 16),
                (byte) (input >>> 8),
                (byte) input};
    }

    /**
     * Convert long to char
     *
     * @param input long
     * @return char
     */
    public static char longToChar(long input) {
        return (char) input;
    }

    /**
     * Convert long to double
     *
     * @param input long
     * @return double
     */
    public static double longToDouble(long input) {
        return (double) input;
    }

    /**
     * Convert long to float
     *
     * @param input long
     * @return float
     */
    public static float longToFloat(long input) {
        return (float) input;
    }

    /**
     * Convert long to long
     *
     * @param input long
     * @return long
     */
    public static long longToLong(long input) {
        return (long) input;
    }

    /**
     * Convert long to short
     *
     * @param input long
     * @return short
     */
    public static short longToShort(long input) {
        return (short) input;
    }

    /**
     * Convert long to String
     *
     * @param input long
     * @return String
     */
    public static String longToString(long input) {
        return java.lang.Long.toString(input);
    }
}