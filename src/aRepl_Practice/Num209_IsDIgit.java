package aRepl_Practice;

public class Num209_IsDIgit {
    public static void main(String[] args) {

    }

    public static String extractNum(String s) {
        String digit="";
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isDigit(s.charAt(i))){
                digit+=s.charAt(i);
            }
        }


return digit;
    }
}
