package day34;

public class Task {
    public static void main(String[] args) {
        login1("uer","abc12");
        System.out.println("login "+ login2("user","ab12"));
    }

public static void  login1 (String username,String password){

        if (username.equals("user") && password.equals("abc123")){
        System.out.println("login successful");
    } if (!username.equals("user")){
            System.out.println("user name is not valid - failed");
        } if (!password.equals("abc123")){
            System.out.println("password is not valid");
        }
}


    public static boolean  login2 (String username,String password){
//
//        if (username.equals("user") && password.equals("abc123")){
//            return true;
//        }else {
//           return false;
//        }
   return (username.equals("user") && password.equals("abc123"));


    }


}
