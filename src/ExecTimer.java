public class ExecTimer {

    private static long startTimeStamp = 0;

    // Angiver starttiden for stopuret
    public static void start() {
        startTimeStamp = System.currentTimeMillis();
    }

    /* Angiver stoptiden og traekker starttiden fra,
     for at få exectiden. Resultatet bliver skrevet til konsolen.
      */

    public static void stop() {
        long stopTimeStamp = System.currentTimeMillis();
        long execTime = stopTimeStamp - startTimeStamp;
        System.out.println("Execution time: " + execTime + "ms");
    }
}
