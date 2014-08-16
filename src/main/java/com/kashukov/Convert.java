package com.kashukov;

/**
 * Convert primitive data types any-to-any.
 */
public class Convert {

    /* ------------------- boolean ------------------- */

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
    public static String booleanToString(boolean input) {
        return Boolean.toString(input);
    }

    /* ------------------- byte ------------------- */

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
    public static String byteToString(byte input) {
        return Byte.toString(input);
    }

    /* ------------------- byte[] ------------------- */

    /* ------------------- char ------------------- */

    /* ------------------- double ------------------- */

    /* ------------------- float ------------------- */

    /* ------------------- int ------------------- */

    /* ------------------- long ------------------ */

    /* ------------------- short ------------------- */

    /* ------------------- String ------------------- */

    /**
     * Convert short to String
     *
     * @param input short
     * @return String
     */
    public static String shortToString(short input) {
        return Short.toString(input);
    }

}