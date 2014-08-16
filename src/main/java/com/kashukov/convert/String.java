package com.kashukov.convert;

/**
 * Convert String to any primitive data type
 */
public class String {
    /**
     * Convert String to boolean
     * String example: "true", "false".
     * Not case sensitive conversion.
     *
     * @param input String
     * @return boolean
     */
    public static boolean stringToBoolean(java.lang.String input) {
        return java.lang.Boolean.parseBoolean(input);
    }

    /**
     * Convert String to byte
     * String example: "154".
     *
     * @param input String
     * @return byte
     */
    public static byte stringToByte(java.lang.String input) {
        return java.lang.Byte.parseByte(input);
    }

    /**
     * Convert String to byte[]
     *
     * @param input String
     * @return byte[]
     */
    public static byte[] stringToByteArray(java.lang.String input) {
        return input.getBytes();
    }

    /**
     * Convert String to char (first character)
     *
     * @param input String
     * @return char
     */
    public static char stringToChar(java.lang.String input) {
        return input.charAt(0);
    }

    /**
     * Convert String to double
     *
     * @param input String
     * @return double
     */
    public static double stringToDouble(java.lang.String input) {
        return java.lang.Double.parseDouble(input);
    }

    /**
     * Convert String to float
     *
     * @param input String
     * @return float
     */
    public static float stringToFloat(java.lang.String input) {
        return java.lang.Float.parseFloat(input);
    }

    /**
     * Convert String to int
     *
     * @param input String
     * @return int
     */
    public static int stringToInt(java.lang.String input) {
        return java.lang.Integer.parseInt(input);
    }

    /**
     * Convert String to long
     *
     * @param input String
     * @return long
     */
    public static long stringToLong(java.lang.String input) {
        return java.lang.Long.parseLong(input);
    }

    /**
     * Convert String to short
     *
     * @param input String
     * @return short
     */
    public static short stringToShort(java.lang.String input) {
        return java.lang.Short.parseShort(input);
    }
}