package ro.webdata.echo.commons.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Timespan {
    private Timespan() {}

    public static List<HashMap<String, String>> TIMESPAN = new ArrayList<>();

    private static Map<String, String> getTimespan(String language, String value) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("lang", language);
        hashMap.put("value", value);

        return hashMap;
    }
}
