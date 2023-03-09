package java8Interface;

public interface Interface1 {

    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }
    default void log11(String str){
        System.out.println("I11 logging::"+str);
    }
//    default String toString(){
//        System.out.println();
//     return "toString is method Object and it is imposible";
//    }
//    default boolean equals(Object s){
//        return true;
//
//    }
}
