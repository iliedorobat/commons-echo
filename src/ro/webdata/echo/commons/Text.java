package ro.webdata.echo.commons;

import org.apache.commons.text.CaseUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public final class Text {
    public static final String REGEX_TEXT_SEPARATORS = "[;,]";
    private static final boolean CAPITALIZE_FIRST_LETTER = false;

    private Text() {}

    public static String attachesSchemaToValue(String schema, String value) {
        return "##" + schema + "## " + value;
    }

    /**
     * Transform a literal value (e.g.: "wall@en") into a camel-case string
     * @param input The original input
     * @return The camel-case transformed value
     */
    public static String prepareCamelCaseText(String input) {
        String langSeparator = input.substring(input.length() - 3, input.length() - 2);

        if (langSeparator.equals("@")) {
            String text = input.substring(0, input.length() - 3);
            return CaseUtils.toCamelCase(text, CAPITALIZE_FIRST_LETTER, Const.CHAR_DELIMITER);
        }

        return CaseUtils.toCamelCase(input, CAPITALIZE_FIRST_LETTER, Const.CHAR_DELIMITER);
    }

    /**
     * Transform the value into a camel-case string
     * @param value The original input
     * @return The camel-case transformed value
     */
    public static String toCamelCase(String value) {
        return CaseUtils.toCamelCase(value, CAPITALIZE_FIRST_LETTER, Const.CHAR_DELIMITER);
    }

    public static String toCamelCase(String value, boolean capitalizeFirstLetter, char[] delimiters) {
        return CaseUtils.toCamelCase(value, capitalizeFirstLetter, delimiters);
    }

    /**
     * Replace all non-alphanumeric characters with underscore ("_").
     * @param value The input value
     * @return The formatted value
     */
    public static String sanitizeString(String value) {
        if (value == null) {
            return null;
        }

        String regex = "(?U)[^\\p{Alnum}]+";
        String replacement = Const.UNDERSCORE_PLACEHOLDER;
        return value.replaceAll(regex, replacement);
    }

    /**
     * Encode the URI
     * @param uri The URI
     * @return The encoded URI
     */
    public static String encodeURI(String uri) {
//        return URLEncoder.encode(uri, StandardCharsets.UTF_8); // Java 10

        try {
            String encodingName = StandardCharsets.UTF_8.displayName();
            return URLEncoder.encode(uri, encodingName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return uri;
        }
    }

    /**
     * Encode the space character
     * @param uri The URI
     * @return The encoded URI
     */
    public static String encodeSpace(String uri) {
        if (uri == null) {
            return null;
        }

        return uri.replaceAll(" ", "%20");
    }
}
