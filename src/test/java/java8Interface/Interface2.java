package java8Interface;

public interface Interface2 {
    void method2();

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }
    void method3();
    default void log12(String str){
        System.out.println("I12 logging::"+str);
    }
}
