package abstrctPackage;

public class Child extends Base{
    public Child(){
        System.out.println("Child");
    }

    @Override
    public void draw() {
        System.out.println("Realese interface");
    }

    @Override
    public void process() {

    }

    @Override
    public void process2() {

    }
}
