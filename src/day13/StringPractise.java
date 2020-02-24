package day13;

public class StringPractise {
    public static void main(String[] args) {
        String s1 = "Israfil";
        System.out.println(s1.equals("abc"));
        System.out.println(s1.equalsIgnoreCase("HELLO"));
        System.out.println("My name is " + s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase().toLowerCase());
        int lenghtof = s1.length();
        if (lenghtof>4){
            System.out.println("more than 4 character");
        }else {
            System.out.println("this is less than 4 character");
        }

        String name="Sohrab";
        System.out.println(name);
        name="Lala";
        System.out.println(name);
        name.toUpperCase();
        System.out.println(name);
        System.out.println(name.toUpperCase());
        name=name.toUpperCase();
        System.out.println(name);









    }
}
