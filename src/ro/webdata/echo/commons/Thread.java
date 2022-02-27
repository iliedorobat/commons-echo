package ro.webdata.echo.commons;

public class Thread {
    /** The maximum number of times the application will attempt to get data if an error is encountered */
    public static final int ERROR_THRESHOLD = 5;
    public static final int DEFAULT_SLEEP_TIME = 100;
    public static final int ERROR_SLEEP_TIME = 5000;

    public static void sleep(int counter, int divisor) {
        if (counter > 0 && counter % divisor == 0) {
            sleep(0);
        }
    }

    public static void sleep(long time) {
        long sleepTime = time > 0 ? time : 100;

        try {
            System.out.println("Sleeping " + sleepTime + " milliseconds");
            java.lang.Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
