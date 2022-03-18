package ro.webdata.echo.commons.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class UrlValidator {
    public static boolean isValid(String url, List<String> exceptedUrls) {
        // Strip accents because apache validator invalidates a URL which contains accents
        String preparedUrl = StringUtils.stripAccents(url);
        org.apache.commons.validator.routines.UrlValidator validator = new org.apache.commons.validator.routines.UrlValidator();

        if (preparedUrl.toLowerCase().startsWith("www")) {
            return validator.isValid("https://" + preparedUrl) || validator.isValid("http://" + preparedUrl);
        }

        // Skip checking the list of URLs
        // E.g.: "http://ghidulmuzeelor.cimec.ro/id.asp?k=2083&-Muzeul-Popa-Popa`s-TIMISOARA-Timis"
        //      - "`" is not a valid URL character but the link works
        if (exceptedUrls != null && exceptedUrls.contains(url)) {
            return true;
        }

        return validator.isValid(preparedUrl);
    }
}
