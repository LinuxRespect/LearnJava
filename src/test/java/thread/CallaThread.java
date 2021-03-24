package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallaThread implements Callable<String> {
    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            System.out.println("Call " + i);
            stringBuilder.append("Call " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
