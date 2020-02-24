package day15;

public class ReversingString {
    public static void main(String[] args) {

        String name="Israfil";
        System.out.println(name.charAt(6) + " " + name.charAt(5)+ " " +name.charAt(4) +
                  " "+ name.charAt(3)+ " "+ name.charAt(2)+ " "+name.charAt(1)+ " "+name.charAt(0));

String name2="Nigar";
        System.out.println(name2.charAt(name2.length()-1));

        int charactercount=name.length();
        int lastCharIndex=charactercount-1;
        char lastChar=name.charAt(lastCharIndex);
        System.out.println("Last Char is " + lastChar);
        System.out.println("last char in one shot" + name.charAt(name.length()-1));

    }
}
