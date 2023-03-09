package java8Interface;

public interface InterfaceWithoutModificator {

   double PI=3.14;
   public int width = 0;
   int height = 0;

    abstract void methodAbstractSimple();
    public void method2 ();
    default String createDefaultMethod(){
        System.out.println("=========DEFAULT METHOD========");
        return "Hello default method";
    }
    static void createSimpleStatic(){
        System.out.println("Created static method");

    }

    default int getArea() {
        return width * height;
    }
}

