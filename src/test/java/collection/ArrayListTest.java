package collection;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;


public class ArrayListTest {
    protected String sProt = "asf";
    public static String sStat = "dfadsfasdfa";

    public static void main(String[] args) {
     //   addAsListAndSort();
      //  mapTest();


    }

    public void addAllElement() {
        System.out.println(sStat);
        String[] array = {"H", "e", "l", "l", "o"};
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "H", "e", "l", "l", "o");
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println("==============================");

    }

    public static void addAsListAndSort() {
        String mercuriy = new String("Меркурий");
        String venera = new String("Венера");
        String mars = new String("марс");
        String earth = new String("земля");
        ArrayList<String> listPlanet = new ArrayList<>(Arrays.asList(mercuriy, venera, mars, earth));

        List<String> upperListPlanet = listPlanet.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

     //   Collections.sort(upperListPlanet);
        System.out.println(upperListPlanet.toString());
        upperListPlanet.stream().forEach(x -> System.out.print(x + ","));

        System.out.println("==============================");

    }

    public static void mapTest(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Vova");
        map.put(212133, "Лидия Аркадьевна Бубликова");
        map.put(162348, "Иван Михайлович Серебряков");
        map.put(8082771, "Дональд Джон Трамп");

        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.println(m);
        }

        if (!map.isEmpty()){
            System.out.println(map);
        }

        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        ArrayList<String> values = new ArrayList<>(map.values());
        System.out.println(values);

    }
}
