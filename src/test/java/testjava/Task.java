package testjava;




import java.util.*;
import java.util.function.Consumer;

public class Task {

    public static void main(String[] args) {
       // print1(3);
   /*     List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names.toString());*/


  /*      int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(num);*/
    //    num = 3;

       /* Consumer<Person> greeter = (s) -> System.out.println("Hello, " + s.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));*/

       /* List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.forEach(System.out::println);
       // list.stream().map((x) -> x*x).forEach(System.out::println);*/

  /*          NavigableMap<String, Number> nmap = new TreeMap<String, Number>();
            nmap.put("one", new Integer(1));
            nmap.put("two", new Integer(2));
            nmap.put("three", new Integer(3));
            nmap.put("four", new Integer(4));

            System.out.println(nmap);
            Map<String, Number> map = nmap.headMap("three");
            System.out.println(map);*/

    /*    LinkedHashSet<String> nmap = new LinkedHashSet<String>();

        nmap.add("one");
        nmap.add("two");
        nmap.add("three");
        nmap.add("four");
        nmap.add("a");


        System.out.println(nmap);*/



        final Collection<String> c = new HashSet<>();
        c.add("s1");
        c.add("s2");
        c.add("s3");
        Iterator i = c.iterator();
        i.remove();
        System.out.println(c);



/*
        List<Integer> list = Arrays.asList(1,2,3);
        int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum);*/

    }
    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }
    /*public static void print(int x) {
        if (x <= 0)
            System.out.println("Boom!");
        else {
            System.out.println(x);
            print(x - 1);
            System.out.println(x);
        }
    }*/

    public static void print1(int x)
    {
        if (x <=0)
            System.out.println("Boom!");
        else
        {
            System.out.println(x);
            print2(x - 1);
            System.out.println(x);
        }
    }

    public static void print2(int x)
    {
        if (x <=0)
            System.out.println("Boom!");
        else
        {
            System.out.println(x);
            print3(x - 1);
            System.out.println(x);
        }
    }
    public static void print3(int x)
    {
        if (x <=0)
            System.out.println("Boom!");
        else
        {
            System.out.println(x);
            print1(x - 1);
            System.out.println(x);
        }
    }
}
