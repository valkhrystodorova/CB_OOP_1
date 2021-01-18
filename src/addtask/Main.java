package addtask;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setIndex("04201");
        address1.setCountry("Ukraine");
        address1.setCity("Kyiv");
        address1.setStreet("Peremohy");
        address1.setHouse(128);
        address1.setApartment(128);

        System.out.println(address1.getIndex() + " " + address1.getCountry() + " " + address1.getCity() + " " + address1.getStreet() + " " +
                +address1.getHouse() + " " + address1.getApartment());
    }
}
