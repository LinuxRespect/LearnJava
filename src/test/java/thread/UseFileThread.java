package thread;

public class UseFileThread  extends  Thread{
    CommonResource commonResource;

    public UseFileThread(String name,CommonResource resource){
        super(name);
        this.commonResource = resource;
    }

    public void  run(){
        for (int i = 0; i < 5; i++) {
            commonResource.writing(this.getName(),i);

        }
    }
}
