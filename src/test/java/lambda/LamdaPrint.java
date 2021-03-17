package lambda;

import java.util.Arrays;
import java.util.List;

public class LamdaPrint {
    public static void main(String[] args) {
        List<Integer> listqw = Arrays.asList(1,10,30,45,50);
        System.out.println(listqw.size());
        listqw.forEach(l-> System.out.println(l));

        HelperInterface helperInterface =() ->{
                System.out.println("Hello");

        };
        helperInterface.show();


    }



}
