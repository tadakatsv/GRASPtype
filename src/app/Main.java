package app;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        Address address = new Address(
                "Odessa",
                "Bugaevka",
                "3"
        );

        user.setAddress(address);

        System.out.println("User address: " + user.getAddress());
    }
}
