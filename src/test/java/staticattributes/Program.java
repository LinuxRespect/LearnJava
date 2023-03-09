package staticattributes;

public class Program {
//   @Override
//    public static void convertToLowerCase(){
//        static method doesn't override from Super class
//    }
    public static void main(String[] args) {

        //статический полиморфизм
        Student student = new Student(123);
        System.out.println(Student.faculty);
        Student.convertToLowerCase();

    }
}
