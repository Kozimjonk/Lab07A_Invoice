import java.util.Scanner;

public class Address {
    private Scanner in = new Scanner(System.in);
    private String title;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String title, String street, String city, String state, String zip) {
        this.title = title;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Launch a console dialog using SafeINput to collect the data for the address
     * @return an address
     */
    public Address getAddress()
    {
        Address addressInput = new Address("","","","","");
        addressInput.setTitle(SafeInput.getNonZeroLenString(in, "What is the title of the address?"));
        addressInput.setStreet(SafeInput.getNonZeroLenString(in, "What is the street of the address?"));
        addressInput.setCity(SafeInput.getNonZeroLenString(in, "What is the city of the address?"));
        addressInput.setState(SafeInput.getNonZeroLenString(in, "What is the state of the address?"));
        addressInput.setZip(SafeInput.getNonZeroLenString(in, "What is the zip of the address?"));
        return addressInput;
    }

    @Override
    public String toString() {
        return
                title + '\n' +
                        street + " " + city + '\n' +
                        state + " "+ zip;
    }
}