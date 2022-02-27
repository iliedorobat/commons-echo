package ro.webdata.echo.commons;

public class Thread {
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
