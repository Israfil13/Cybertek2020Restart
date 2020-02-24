package day12;



public class LoginTest {
    public static void main(String[] args) {
        String username="user13";
        String password="pass123";

        if (username.equals("user123") && password.equals("pass123")){
            System.out.println("Login Successful");
        }  else if (!username.equals ("user123") && password.equals("pass123")){
            System.out.println(" Username is not correect ");
    } else if(username.equals ("user123") && !password.equals("pass123")){
            System.out.println("Password is not correct");
        }
        else {
            System.out.println("Neither Username nor password are right");
        }


} }
