package Practice;

public class Address {

    private String city, street, state, zipcode;


    public Address(String city, String street, String state, String zipcode) {

        this.city = city;
        this.street = street;
        this.state = state;
        this.zipcode = zipcode;

    }

    @Override
    public String toString() {
        return city+ ", "+street+", "+state+", "+zipcode;
    }
}
