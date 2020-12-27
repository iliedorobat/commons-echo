package ro.webdata.echo.commons;

public final class Print {
    private Print() {}

    public static void tooBigCentury(String operation, String position, int century) {
        System.err.println(operation + ": " + "The " + position + " century " + century
                + " is higher than the last century the data has been updated ("
                + Date.LAST_UPDATE_CENTURY + ")!");
    }

    public static void tooBigMillennium(String operation, String position, int millennium) {
        System.err.println(operation + ": " + "The " + position + " millennium " + millennium
                + " is higher than the last millennium the data has been updated ("
                + Date.LAST_UPDATE_MILLENNIUM + ")!");
    }

    public static void tooBigYear(String operation, String position, int year) {
        System.err.println(operation + ": " + "The " + position + " year " + year
                + " is higher than the last year the data has been updated ("
                + Date.LAST_UPDATE_YEAR + ")!");
    }

    public static void unknownMonth(int monthNumber, String monthName) {
        System.err.println("Invalid month number: " + monthNumber
                + " (month name: \"" + monthName + "\")!");
    }

    // @param shouldPrint = EnvConst.PRINT_OPERATION
    public static void operation(String operation, boolean shouldPrint) {
        if (shouldPrint)
            System.out.println(operation);
    }

    // @param shouldPrint = EnvConst.PRINT_OPERATION
    public static void operation(String operation, String fullPath, boolean shouldPrint) {
        if (shouldPrint)
            System.out.println(operation + ": " + fullPath);
    }
}
