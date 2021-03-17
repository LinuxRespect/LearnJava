package overloadingMethod;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.method(42);
        //в данном случае в классе B метод method перегружается, а не переопределяется,
        // так как изменяется тип аргумента,
        // поэтому вызывается метод класса A
    }
}
