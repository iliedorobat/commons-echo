package ro.webdata.echo.commons;

import java.io.StringWriter;
import java.util.HashMap;

public class Writer {
    /**
     * Add a new line to a StringWriter
     * @param sw The input StringWriter
     * @param columns Column cells
     */
    public static void appendLine(StringWriter sw, String ...columns) {
        for (int i = 0; i < columns.length; i++) {
            String separator = i < columns.length - 1 ? "|" : "\n";
            sw
                    .append(columns[i])
                    .append(separator);
        }
    }

    /**
     * Safety conversion of hasMap to string
     * @param hashMap The input hashMap
     * @return String representation of the input hashMap
     */
    public static String toString(HashMap<String, String> hashMap) {
        return hashMap != null
                ? hashMap.toString()
                : "";
    }
}
