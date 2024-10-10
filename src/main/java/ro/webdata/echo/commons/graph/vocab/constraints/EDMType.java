package ro.webdata.echo.commons.graph.vocab.constraints;

import java.util.ArrayList;

public final class EDMType {
    /**
     * Accepted values for <b>edm:type</b> property
     */
    public static ArrayList<String> VALUES = new ArrayList<>();

    public static String VALUE_3D = "3D";
    public static String VALUE_IMAGE = "IMAGE";
    public static String VALUE_SOUND = "SOUND";
    public static String VALUE_TEXT = "TEXT";
    public static String VALUE_VIDEO = "VIDEO";

    static {
        VALUES.add(VALUE_3D);
        VALUES.add(VALUE_IMAGE);
        VALUES.add(VALUE_SOUND);
        VALUES.add(VALUE_TEXT);
        VALUES.add(VALUE_VIDEO);
    }

    /**
     * Check if EDMType.VALUES contains the input value
     * @param value Input string
     * @return true/false
     */
    public static boolean contains(String value) {
        return EDMType.VALUES.contains(value);
    }
}
