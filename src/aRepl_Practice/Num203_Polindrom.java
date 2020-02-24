package aRepl_Practice;

public class Num203_Polindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses run"));
    }
    public static boolean isPalindrome(String check) {

        String reverse="";
       check=check.replace(" ","");

        for (int i = check.length()-1; i >=0; i--) {
            reverse+=check.charAt(i);
           reverse= reverse.replace(" ","");

        }
        if (reverse.equalsIgnoreCase(check)){
            return true;
        }else {
            return false;
        }


    }

}
