package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    public static void main(String[] args) {
        WalkThread walkThread = new WalkThread();
        walkThread.setDaemon(true);
        walkThread.start();
        Thread talkThread  =new Thread(new TalkThread());
        talkThread.setPriority(Thread.MAX_PRIORITY);
        talkThread.start();
       /* ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new CallaThread());
        try {
           String res =  future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();*/
        System.out.println("end the Main");
    }
}
