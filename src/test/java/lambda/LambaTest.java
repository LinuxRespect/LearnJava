package lambda;

public class LambaTest {
    public static <T> void main(String[] args) {
        Oparationable<Integer> operationable= (x, y) ->x + y;
        System.out.println( operationable.calculate(3,20));
        Oparationable<String> oparationable1 =(i,j)->(i+j);
        String result1 = oparationable1.calculate("sdf","hhhg");

        //System.out.println(result);
        System.out.println(result1);

    }
    interface Oparationable<T> {
       T  calculate(T x,T y);
    }
    interface Printable{

    }

//    static int x = 10;
//    static int y = 20;
//    public static void main(String[] args) {
//        lambda.Operation op = ()->{
//
//            x=30;
//            return x+y;
//        };
//        System.out.println(op.calculate()); // 50
//        System.out.println(x); // 30 - значение x изменилось
//    }
}

interface Operation{
    int calculate();
}
