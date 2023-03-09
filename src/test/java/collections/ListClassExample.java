package collections;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import subclasess.A;

public class ListClassExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        //      List<int> list1 = new ArrayList<>(); нелья создавать колекции с примитивных типов
        HashMap<Integer, Integer> hashMap = new HashMap<>(); //ассинхронный и может содержат null как в ключах так и в значениях
        //Данная реализация не дает гарантий относительно порядка элементов с течением времени
        hashMap.put(null, 5);
        hashMap.put(6, null);
        hashMap.put(1, 2);
        System.out.println("Key = " + hashMap.keySet());
        System.out.println("Value = " + hashMap.values());
        System.out.println("HashMap collections: " + hashMap.toString());
        /////////////////////////
        //        LinkedHashMap —это упорядоченная реализация хэш -таблицы.Здесь, в отличии от HashMap, порядок итерирования равен
        //        порядку добавления элементов.Данная особенность достигается благодаря двунаправленным связям между элементами
        //        (аналогично LinkedList).Но это преимущество имеет также и недостаток —увеличение памяти, которое
        //        занимет коллекция.
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(5, 3);
        linkedHashMap.put(1, 3);
        System.out.println("LinkedHashMap key= " + linkedHashMap.keySet());
        System.out.println("LinkedHashMap value = " + linkedHashMap.values());
        System.out.println("LinkedHashMap collections: " + linkedHashMap.toString());
        ////////////////
        //        TreeMap —реализация Map основанная на красно - чёрных деревьях.Как и LinkedHashMap является
        //        упорядоченной.По - умолчанию, коллекция сортируется по ключам с использованием принципа "natural ordering", но
        //        это поведение может быть настроено под конкретную задачу при помощи объекта Comparator, который указывается в
        //        качестве параметра при создании объекта TreeMap.
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(5, 3);
        treeMap.put(1, 3);
        System.out.println("TreeMap key= " + treeMap.keySet());
        System.out.println("TreeMap value = " + treeMap.values());
        System.out.println("TreeMap collections: " + treeMap.toString());

        System.out.println("/////Set//////");
        Set<String> set = new HashSet<>();
        set.add("F");
        set.add("D");
        set.add("Hello");
        set.add("D");
        set.add("A");
        set.add("Ccccccc");
        System.out.println("Set = " + set.toString());
        // Set — переводится как "набор". От очереди и списка Set отличается большей абстракцией над хранением элементов.
        // Set — как мешок с предметами, где неизвестно, как лежат предметы и в каком порядке они легли.

        System.out.println("/////TreeSet//////");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("F");
        treeSet.add("D");
        treeSet.add("Hello");
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("Ccccccc");
        System.out.println("Set = " + treeSet.toString());

        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(new String());
        hashSet.add("He");
        hashSet.add(1);
        hashSet.add(null);
        System.out.println("HashSet =" +hashSet.toString());

    }
}
