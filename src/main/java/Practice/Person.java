package Practice;

public class Person {

    private String name;
    private int age;
    private Address address;


    public Person(String name, int age, Address address) {

        this.name = name;
        this.age = age;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("Hyderabad", "st street", "TG", "500043");


        Person person = new Person("Raj", 99, address);

        System.out.println(person);
        System.out.println(address);

    }


}
