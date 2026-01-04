package app;

public class Main {
    public static void main(String[] args) {

        Address address = new Address(
                "Odessa",
                "Bugaevka",
                "3"
        );

        User user = new User("Mikhail", "Tchekmaryov", new Address("Kiev","Kolotushkina","12/3"));

        System.out.println("User before setting new address: " + user);

        user.setAddress(address);

        System.out.println("User after setting new address: " + user);
        System.out.println("User address: " + user.getAddress());
    }
}
