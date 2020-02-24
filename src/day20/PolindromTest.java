package day20;

public class PolindromTest {
    public static void main(String[] args) {
        String name="Nurses run";
       name=name.replace(" ","");
        System.out.println("name = " + name);
        String reversedname ="";

        for (int x = name.length()-1; x >=0 ; x--) {
            reversedname=reversedname+name.charAt(x);
            reversedname.replace(" ","");
//            reversedname=reversedname.trim();
        }
        System.out.println("reversedname = " + reversedname);

        if (name.equalsIgnoreCase(reversedname))   {
            System.out.println("Palindrome has past");
        }else{
            System.out.println("Polindrome test has failed");
        }


    }

}
