package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    // объявление списка
    static List<String> places = new ArrayList<>();

    // заполнение данными
    public static List getPlaces() {

        // добавление страны и города
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {
        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");

        // Фильтрация городов  Создание стрима из коллекции
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((y) -> System.out.println(y));


        //Создание стрима из значений
        Stream<String> streamFromValues = Stream.of("a1 sd", "a2 sdf", "a3 yy");
        streamFromValues
                .filter(p -> p.contentEquals(new StringBuffer("a1 sd")))
                .map(p -> p.toUpperCase())
                .forEach(p -> System.out.println(p + " Hello"));

        // возвращения без дубликатов
        Stream<String> streamFromValues2 = Stream.of("a1", "a2", "a3 yy", "a2");

        List<String> res = streamFromValues2.distinct().collect(Collectors.toList());
        System.out.println(res);

        // filer

        Stream<String> streamValues = Stream.of("a1", "a2", "a3 yy", "a2");
        streamValues
                .filter(j -> j.matches("\\D*\\d*"))
                .forEach(p -> System.out.println(p));
        System.out.println("---------------------");

        Stream<String> streamValues2 = Stream.of("a1", "a2", "a3 yy", "a2");
        streamValues2
                .filter(j -> j.endsWith("2"))
                .forEach(p -> System.out.println(p));
        /////////////////// peek
        System.out.println("---------Peek------------");
        Stream<String> values = Stream.of("a1", "a2", "a3 yy", "a2");
        values
                .map(String::toUpperCase)
                .peek(e -> System.out.print(e + ";"))
                .collect(Collectors.toList());

        //// limit
        System.out.println();
        System.out.println("---------Limit------------");
        Stream<String> value = Stream.of("a1", "a2", "a3 yy", "a2");
        value
                .map(String::toUpperCase)
                .peek(e -> System.out.print(e + ";"))
                .limit(2)
                .collect(Collectors.toList());

        ////sorted
        System.out.println();
        System.out.println("---------Sorted------------");
        Stream<String> val = Stream.of("g","wd", "a1", "a2", "a3 yy", "a2");
        List<String> resalt = val.filter(p->p.length()>0)
                .map(p->p.toLowerCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resalt);



    }


}
