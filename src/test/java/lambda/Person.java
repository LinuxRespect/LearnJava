package lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Person {
    public static List<Person> createRoster() {
        List<Person> listPerson = Arrays.asList(new Person("Petr",LocalDate.of(2002,12,03),Sex.FEMALE,"asd"),
                new Person("Leila",LocalDate.of(2003,12,05),Sex.MALE,"oleh"));
        return listPerson;
    }


    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        int i = LocalDate.now().getYear()- birthday.getYear();
        return i;
    }

    public void printPerson() {
        System.out.println(name+ " "+birthday +" "+gender +" "+ emailAddress);
    }
}
