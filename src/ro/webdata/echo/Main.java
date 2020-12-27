package ro.webdata.echo;

import ro.webdata.echo.commons.Const;
import ro.webdata.echo.commons.Print;

public class Main {
    public static void main(String[] args) {
        Print.operation(Const.OPERATION_START, true);
        System.out.println("ro.webdata.echo.commons");
        Print.operation(Const.OPERATION_END, true);
    }
}
