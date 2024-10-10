package ro.webdata.echo.commons.graph;

import java.util.ArrayList;
import java.util.HashMap;

public final class Timespan {
    private Timespan() {}

    public static ArrayList<HashMap<String, String>> TIMESPAN = new ArrayList<>();

    private static HashMap getTimespan(String language, String value) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("lang", language);
        hashMap.put("value", value);

        return hashMap;
    }
}
