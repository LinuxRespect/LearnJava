package staticattributes;

public class Program {
    public static void main(String[] args) {

        //статический полиморфизм
        Student student = new Student(123);
        System.out.println(Student.faculty);
        Student.convertToLowerCase();

    }
}
