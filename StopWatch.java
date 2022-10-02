import java.util.concurrent.TimeUnit;
public class StopWatch {

    public static void main(String[] args) throws InterruptedException
    {
        long startTime = System.currentTimeMillis();

        TimeUnit.SECONDS.sleep(3);

        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
}





