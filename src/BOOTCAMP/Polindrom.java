package BOOTCAMP;

public class Polindrom {

    public static void main(String[] args) {
        String str="anna";
        System.out.println(ispolindrom(str));
    }


    public static Boolean ispolindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }







    public static boolean isPalindrome3(String s) {
        if (s.length() <= 1)
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
            return isPalindrome3(s.substring(1, s.length() - 1));
    }
}
