package overloadingMethod;

public class B extends A {
    public void method(Integer obj) {
        System.out.println("B");
    }

    public static void methodStatic(){
        System.out.println("Static b");
    }

    public static void methodStatic(String a){
        System.out.println(a+"overload");

    }
}
