package ro.webdata.echo.commons.error;

public class UnknownMonthException extends RuntimeException {
    private final String monthName;
    private final int monthNumber;

    public static String getMessage(int monthNumber, String monthName) {
        return "Invalid month number: " + monthNumber
                + " (month name: \"" + monthName + "\")!";
    }

    public static void printMessage(int monthNumber, String monthName) {
        System.err.println(getMessage(monthNumber, monthName));
    }

    public UnknownMonthException(int monthNumber, String monthName) {
        super(getMessage(monthNumber, monthName));

        this.monthNumber = monthNumber;
        this.monthName = monthName;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
}
