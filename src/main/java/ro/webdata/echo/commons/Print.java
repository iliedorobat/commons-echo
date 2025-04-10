package ro.webdata.echo.commons;

public final class Print {
    private Print() {}

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
