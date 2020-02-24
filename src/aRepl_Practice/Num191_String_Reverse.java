package aRepl_Practice;

public class Num191_String_Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("salam"));
    }


    public static String reverse(String input)
    {       String rever="";
        for (int i = input.length()-1; i >=0 ; i--) {

            rever+=input.charAt(i);
        }
return rever;
    }

}
