package BOOTCAMP;

public class PasswordValid {
    public static void main(String[] args) {

        String password="a";
        boolean length= password.length()>= 8;
        boolean lower= password.matches(".*[a-z].*");
        boolean upper =password.matches(".*[A-Z].*");
        boolean number=password.matches(".*[0-9].*");
        boolean special=password.matches(".*[!@#$?.].*");
    }
}
