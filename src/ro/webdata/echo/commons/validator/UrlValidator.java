package ro.webdata.echo.commons.validator;

import java.util.List;

public class UrlValidator {
    public static boolean isValid(String url, List<String> exceptedUrls) {
        org.apache.commons.validator.routines.UrlValidator validator = new org.apache.commons.validator.routines.UrlValidator();

        if (url.toLowerCase().startsWith("www")) {
            return validator.isValid("https://" + url) || validator.isValid("http://" + url);
        }

        // Skip checking the list of URLs
        // E.g.: "http://ghidulmuzeelor.cimec.ro/id.asp?k=2083&-Muzeul-Popa-Popa`s-TIMISOARA-Timis"
        //      - "`" is not a valid URL character but the link works
        if (exceptedUrls != null && exceptedUrls.contains(url)) {
            return true;
        }

        return validator.isValid(url);
    }
}
