package innerClass;

public class Student {
    private int id;
    private String name;
    private Address address;
     class Address{
        private String email;
        private String city;
        Address(){
        }

        public void action(){
            name="Serge"; //inner class can access to external classes
        }
    }
    public void operation(){
         name="Aloha";
         //city=""; -  не возможен доступ с внешнего класа к полям внутреннего
    }
    public Address getAddress() {
        return address;
    }
}
