package thread;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainSynchroniz {
    public static void main(String[] args) throws Exception {
      try(  CommonResource file  = new CommonResource("src/resouces/thread.txt")){
        UseFileThread useFileThread = new UseFileThread("First",file);
        UseFileThread useFileThread2 = new UseFileThread("Second",file);
        useFileThread.start();
        useFileThread2.start();
        TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException| IOException e) {
            e.printStackTrace();
        }

    }
}
