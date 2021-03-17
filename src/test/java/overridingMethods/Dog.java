package overridingMethods;

public class Dog extends Animal {
  /*  public Integer defineAge (){
        System.out.println("I'm not so big");
        return 5;
    }*/
  /*Float defineAge (){
      System.out.println("I want to be bigger");
      return 5f;
  }*/

/*
  protected Number defineAge (){
      System.out.println("I'm small");
      return 5;
  }*/



 public Integer defineAge (int age){
        System.out.println("I'm not so big");
        return 5;
    }


 /*   protected Float defineAge (float f){
        System.out.println("I want to be bigger");
        return 5f;
    }*/

  /*  private - не может быть от наследуемого метода
   private Number defineAge (){
        System.out.println("I want to be big");
        return 5;
    }*/


    public static void main(String args[]) {
        Animal quest = new Dog();   // 1
        quest.defineAge();   // 2
    }
}
