package fin;
// файнал класс нельзя наследоваться
public final class Example extends  Quest{
    private final int MAX=1000;  //если не инициолизировать здесь, то можно в конструкторе

    private final StringBuilder builder = new StringBuilder();
    //    еще можно инифиализировать в логическом блоке, выполняется его инициализация перед конструкторм
 /*   {
         MAX = 200;
    }*/
    public Example(){
        //MAX=111; - нельзя переопредялть файнал переменные
        builder.append("Hello"); // можно переопределять сам обьект
        //builder= new StringBuilder(); но изменять ссылку нельзя

    }
  /*  public void method () {
        System.out.println("s");
    }*/
    public static void main(String[] args)
    {
        Example example = new Example();
        example.method();
        System.out.println(example.MAX);
    }
}
