package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,30,45,50);
        Consumer<Integer> method =(n)->{
            System.out.println(n);
        };
        list.forEach(method);

    }
}
