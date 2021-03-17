package staticattributes;

public class Student {
    //не является хорошейй практикой написание гет сет для статического поля
    static {
        faculty="TTT";

    }
     static String faculty ="RFF";

    private int startYear=1990;

    public Student(int startYear) {
        this.startYear = startYear;
    }
    public void test(){
        faculty="New";
    }
    public static void convertToLowerCase(){
       // startYear  -статический метод не может обращатся к НЕ статическому полю
       // this.startYear - к this тоже не может обращатся

        System.out.println(faculty.toLowerCase());
    }
}
