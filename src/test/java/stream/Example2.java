package stream;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args){
//       List<String> arrayList = Arrays.asList("Highload", "High", "Load", "Highload2");
//        System.out.println(arrayList.stream().skip(arrayList.size()-1).findFirst().orElse("0"));

//        String[] array = {"Java", "Ruuuuussshhh"};
//        Stream<String> streamOfArray = Arrays.stream(array);
//        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
//            .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
//            .collect(Collectors.toList()).forEach(System.out::println);

//        String[] array = {"Java", "Ruuuuussshhh"};
//        Stream<String> streamOfArray = Arrays.stream(array);
//         streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
//            .map(Arrays::stream).distinct()//Сделать массив в отдельный поток
//            .collect(Collectors.toList()).forEach(System.out::println);


//        Stream.of(2, 3, 0, 1, 3)
//            .flatMapToInt(x -> IntStream.range(0, x))
//            .forEach(System.out::print);// 010120012

//        Stream.of(2, 3, 0, 1, 3)
//            .map(x -> IntStream.range(0, x))
//            .forEach(System.out::println);//перечень стримов(потоков);

//        int sum = Stream.of(1, 2, 3, 4, 5).reduce(10, (acc, x) -> acc + x);// = 25
//        System.out.println(sum);
        String s = "Java is a popular language. Java is not popular in this year.But I hope that java will be popular in future.";
        System.out.println(Stream.of(s.split(" ")).map(String::toLowerCase).filter(x->x.equals("java")).count());
    }
}
