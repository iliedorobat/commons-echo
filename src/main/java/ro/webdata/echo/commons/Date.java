package ro.webdata.echo.commons;

import ro.webdata.echo.commons.error.UnknownMonthException;

import java.text.DateFormatSymbols;
import java.util.Locale;

public final class Date {
    public static final int LAST_UPDATE_CENTURY = 21;
    public static final int LAST_UPDATE_MILLENNIUM = 3;
    public static final int LAST_UPDATE_YEAR = 2014;
    private static final String UNKNOWN_MONTH = "Unknown";

    private Date() {}

    /**
     * Trim the value and replace all commas (",") with an empty placeholder ("").<br/>
     * This pre-processing is used for cases similar with "1914, aprilie 3".
     * @param value The original value
     * @return The prepared value
     */
    public static String prepareDate(String value) {
        return value.replaceAll(",", Const.EMPTY_VALUE_PLACEHOLDER).trim();
    }

    /**
     * Map a month expressed as a number or as a month name
     * to the corresponding English month name<br/>
     *      E.g.: "1" => "January"<br/>
     *      E.g.: "01" => "January"<br/>
     *      E.g.: "ianuarie" => "January"
     * @param month The number of the month ("1" to "12") or the name of the month
     *              ("ianuarie", "februarie" etc.)
     * @return The name of the month
     */
    public static String getMonthName(String month) {
        int monthNumber = -1;

        try {
            // Treat the case when the month is a number written as a string ("01", "1" etc.)
            monthNumber = Integer.parseInt(month);
        } catch (NumberFormatException ignored) {
            monthNumber = mapMonthToNumber(month);
        }

        return mapNumberToMonth(monthNumber, month);
    }

    /**
     * Map a number to the corresponding English month name<br/>
     * E.g.: 1 => "January"
     * @param monthNumber The number of the month (1 to 12)
     * @param monthName The name of the month ("ianuarie", "februarie" etc.)
     * @return The name of the month
     */
    private static String mapNumberToMonth(int monthNumber, String monthName) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.ENGLISH);
        String month = UNKNOWN_MONTH;

        try {
            // Exception treated for the case of "1877 en 20" (using TimespanRegex.DATE_TEXT)
            month = dateFormatSymbols.getMonths()[monthNumber - 1];
        } catch (Exception ignored) {
            UnknownMonthException.printMessage(monthNumber, monthName);
        }

        return month;
    }

    /**
     * Map a month name to the corresponding number<br/>
     * E.g.: "ianuarie" => 1
     * @param month The month name
     * @return The month number
     */
    private static int mapMonthToNumber(String month) {
        String value = month
                .replaceAll("\\.", Const.EMPTY_VALUE_PLACEHOLDER)
                .toLowerCase()
                .trim();

        if (value.startsWith("jan") || value.startsWith("ian")) {
            return 1;
        } else if (value.startsWith("feb") || value.equals("fevruarie")) {
            // E.g.: feb, febr, february, februarie, fevruarie
            return 2;
        } else if (value.startsWith("mar")) {
            return 3;
        } else if (value.startsWith("apr")) {
            // E.g.: apr, aprl, april, aprilie
            return 4;
        } else if (value.equals("may") || value.equals("mai")) {
            return 5;
        } else if (value.startsWith("jun") || value.startsWith("iun") || value.equals("iumie")) {
            return 6;
        } else if (value.startsWith("iul") || value.startsWith("jul")) {
            return 7;
        } else if (value.startsWith("aug")) {
            return 8;
        } else if (value.startsWith("sep")) {
            return 9;
        } else if (value.startsWith("oct") || value.startsWith("0ct")) {
            // E.g.: octombrie, 0ctombrie
            return 10;
        } else if (value.startsWith("noi") || value.startsWith("nov")) {
            return 11;
        } else if (value.startsWith("dec")) {
            return 12;
        }

        return -1;
    }
}
