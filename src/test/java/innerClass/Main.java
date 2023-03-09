package innerClass;

public class Main {
    public static void main(String[] args) {
        Student.Address address= new Student().new Address();
        System.out.println(address.getClass());
        Student student = new Student();
        student.getAddress();

    }
}
