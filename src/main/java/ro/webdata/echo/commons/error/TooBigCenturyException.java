package ro.webdata.echo.commons.error;

import ro.webdata.echo.commons.Date;

public class TooBigCenturyException extends RuntimeException {
    private final String position;
    private final int century;

    public static String getMessage(String operation, String position, int century) {
        return operation + ": " + "The " + position + " century " + century
                + " is higher than the last century the data has been updated ("
                + Date.LAST_UPDATE_CENTURY + ")!";
    }

    public static void printMessage(String operation, String position, int century) {
        System.err.println(getMessage(operation, position, century));
    }

    public TooBigCenturyException(String operation, String position, int century) {
        super(getMessage(operation, position, century));

        this.position = position;
        this.century = century;
    }

    public String getPosition() {
        return position;
    }

    public int getCentury() {
        return century;
    }
}
