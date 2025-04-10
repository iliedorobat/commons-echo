package ro.webdata.echo.commons.error;

import ro.webdata.echo.commons.Date;

public class TooBigYearException extends RuntimeException {
    private final String position;
    private final int year;

    public static String getMessage(String operation, String position, int year) {
        return operation + ": " + "The " + position + " year (" + year
                + ") is higher than the last year the data has been updated ("
                + Date.LAST_UPDATE_YEAR + ")!";
    }

    public static void printMessage(String operation, String position, int year) {
        System.err.println(getMessage(operation, position, year));
    }

    public TooBigYearException(String operation, String position, int year) {
        super(getMessage(operation, position, year));

        this.position = position;
        this.year = year;
    }

    public String getPosition() {
        return position;
    }

    public int getYear() {
        return year;
    }
}
