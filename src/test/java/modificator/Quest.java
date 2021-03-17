package modificator;

import collection.ArrayListTest;

public class Quest extends ArrayListTest {

    public static void main (String [] args){
        Quest q = new Quest();
        System.out.println(q.sProt);

    }

   //класс неможет быть public static class fin.Quest {}
    //public abstract final class fin.Quest {}
    //private class fin.Quest {}


    //моно использовать final fin.Quest{}
    //public class fin.Quest {}

    //Статические private-поля класса доступны во всех методах этого класса, как и статические public-поля.
    // К protected-полям класса есть доступ из подклассов, находящихся в другом пакете.
    // Поля класса, объявленные без модификатора доступа (friendly), видны в классах этого же пакета.
    //
}
