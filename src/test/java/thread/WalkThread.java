package thread;

import java.util.concurrent.TimeUnit;

public class WalkThread extends Thread{
    public void run(){
        for(int i=0;i<7;i++){
           // System.out.println("Walk "+ i);
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("end of WalkThread");
            }
        }
    }
}
