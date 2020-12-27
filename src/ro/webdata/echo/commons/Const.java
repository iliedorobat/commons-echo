package ro.webdata.echo.commons;

public final class Const {
    public static final char[] CHAR_DELIMITER = new char[]{' '};
    public static final String EMPTY_VALUE_PLACEHOLDER = "";
    public static final String UNDERSCORE_PLACEHOLDER = "_";
    public static final String CENTURY_PLACEHOLDER = "century";
    public static final String MILLENNIUM_PLACEHOLDER = "millennium";
    public static final String DBPEDIA_CENTURY_PLACEHOLDER = UNDERSCORE_PLACEHOLDER + CENTURY_PLACEHOLDER;
    public static final String DBPEDIA_MILLENNIUM_PLACEHOLDER = UNDERSCORE_PLACEHOLDER + MILLENNIUM_PLACEHOLDER;

    public static final String LANG_EN = "en";
    public static final String LANG_RO = "ro";

    public static final String OPERATION_END = "----- END -----";
    public static final String OPERATION_MAPPING = "----- MAPPING -----";
    public static final String OPERATION_START = "----- START -----";
}
