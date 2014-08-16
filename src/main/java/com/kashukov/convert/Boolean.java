package com.kashukov.convert;

/**
 * Convert boolean to any primitive data type.
 */
public class Boolean {
    /**
     * Convert boolean to byte
     *
     * @param input boolean
     * @return byte
     */
    public static byte booleanToByte(boolean input) {
        return (byte) (input ? 1 : 0);
    }

    /**
     * Convert boolean to byte[]
     *
     * @param input boolean
     * @return byte[]
     */
    public static byte[] booleanToByteArray(boolean input) {
        return new byte[]{
                (byte) (input ? 1 : 0)
        };
    }

    /**
     * Convert boolean to char
     *
     * @param input boolean
     * @return char
     */
    public static char booleanToChar(boolean input) {
        return (char) (input ? 1 : 0);
    }

    /**
     * Convert boolean to double
     *
     * @param input boolean
     * @return double
     */
    public static double booleanToDouble(boolean input) {
        return input ? 1.0 : 0.0;
    }

    /**
     * Convert boolean to float
     *
     * @param input boolean
     * @return float
     */
    public static float booleanToFloat(boolean input) {
        return input ? 1.0f : 0.0f;
    }

    /**
     * Convert boolean to int
     *
     * @param input boolean
     * @return int
     */
    public static int booleanToInt(boolean input) {
        return input ? 1 : 0;
    }

    /**
     * Convert boolean to long
     *
     * @param input boolean
     * @return long
     */
    public static long booleanToLong(boolean input) {
        return input ? 1 : 0;
    }

    /**
     * Convert boolean to short
     *
     * @param input boolean
     * @return short
     */
    public static short booleanToShort(boolean input) {
        return (short) (input ? 1 : 0);
    }

    /**
     * Convert boolean to String
     *
     * @param input boolean
     * @return String
     */
    public static java.lang.String booleanToString(boolean input) {
        return java.lang.Boolean.toString(input);
    }
}