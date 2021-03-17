package collection;

import java.util.*;

public class listColl {
    //list - это колекция которая наследуется от интерфейса Collection
    //Lists may contain duplicate elements
    //в каком порядке зашел, в таком и заберешь
    //
    /*Positional access — manipulates elements based on their numerical position in the list.
     This includes methods such as get, set, add, addAll, and remove.

     Search — searches for a specified object in the list and returns its numerical position.
     Search methods include indexOf and lastIndexOf.

    Iteration — extends Iterator semantics to take advantage of the list's sequential nature.
    The listIterator methods provide this behavior.
    Range-view — The sublist method performs arbitrary range operations on the list.*/
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("listq");
        list.add(12);
        list.add("listw");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ArrayList");
        list2.add(new String("arr"));
        list2.add(new String("arr"));
        list2.add("ArrayList");
        System.out.println(list);
        System.out.println(list2);

        list.add(list2);
        System.out.println(list);
        System.out.println(list.get(3));
        list2.add(String.valueOf(list));
        System.out.println(list2);
        list2.add(4,"paste");    // не удаляется при вставке значение на той позиции, просто смещается
        System.out.println(list2);

        list2.addAll(6,list);
        System.out.println(list2);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Test");
        list3.add("adv");
        list2.add(String.valueOf(list3));
        System.out.println(list2.get(list2.size()-1));


        System.out.println("List="+list);
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("List="+list);
        Collections.replaceAll(list,"listq","1234");
        System.out.println("List random ="+list);
        Collections.sort(list);
        System.out.println(list);

        Person person =new Person("Vasya",10);
        Person personq =new Person("Vasyaq",10);
        ArrayList<Person> personMap = new ArrayList<>();
       personMap.add(person);
        personMap.add(personq);

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Лондон");
        Collections.addAll(cities,"Париж1", "Лондон", "Мадрид");
        cities.stream() // получаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
                .forEach(s->System.out.println(s));


        ArrayList<String> listIt= new ArrayList<>();
        listIt.add("ad");
        listIt.add("bc");
        listIt.add("asdfffe3");


    }
}
