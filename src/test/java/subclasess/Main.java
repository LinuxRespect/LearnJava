package subclasess;

public class Main {
 /*   public static void main(String[] args) {
       Person person = new Student ();
        System.out.println(person.version);
        Student person1 = new Student();
        System.out.println(person1.version);
        Person per3 =new Person();
        System.out.println(per3.version);
    }*/

    public static void main(String[] args) {
        A object1 = new A();
        C object2 = new C();
        object1 = object2;
       // object2.testC();

        ((C) object1).testC();
     //   object1 = (B) object2;
      //  object1 = new C();
     //   object1 = (C) new B(); не работает
        // line 0
        C object3 = (C) object1;
    }






}
