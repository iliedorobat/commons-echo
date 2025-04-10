package ro.webdata.echo.commons.error;

import ro.webdata.echo.commons.Date;

public class TooBigMillenniumException extends RuntimeException {
    private final String position;
    private final int millennium;

    public static String getMessage(String operation, String position, int millennium) {
        return operation + ": " + "The " + position + " millennium (" + millennium
                + ") is higher than the last millennium the data has been updated ("
                + Date.LAST_UPDATE_MILLENNIUM + ")!";
    }

    public static void printMessage(String operation, String position, int millennium) {
        System.err.println(getMessage(operation, position, millennium));
    }

    public TooBigMillenniumException(String operation, String position, int millennium) {
        super(getMessage(operation, position, millennium));

        this.position = position;
        this.millennium = millennium;
    }

    public String getPosition() {
        return position;
    }

    public int getMillennium() {
        return millennium;
    }
}
