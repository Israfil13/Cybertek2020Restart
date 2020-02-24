package day14;

public class EmailChecker {
    public static void main(String[] args) {

        String email="israfil@gmail.com";
        boolean containat=!email.contains("@");
        boolean containspace= email.contains(" ");


        if (containat || containspace){
            System.out.println(" INvalid email");
        }
       else if (email.endsWith("gmail.com")) {
            System.out.println("Gmail");
        }else if ( email.endsWith("yahoo.com")) {
            System.out.println("Yahoo");
        } else if (email.endsWith("mail.ru")) {
            System.out.println("Russian emial");

        }else {
            System.out.println("Invalid email");
        }



















    }
}
