package day14;

public class StringReview {
    public static void main(String[] args) {

        String name = "I love Sohrab";
        System.out.println("name = " + name);
        System.out.println(name.contains("Sohrab"));
        boolean gotSohrab = name.contains("Sohrab");
        System.out.println("gotSohrab = " + gotSohrab);

        boolean startwithI = name.startsWith("I");
        System.out.println("startwithI = " + startwithI);

        boolean endwithb= name.endsWith("a");
        System.out.println("endwithb = " + endwithb);




        String password = "Ab_$111131";
        if ((password.length()>=8 && password.length()<=16) && password.contains("_") || password.contains("$") && password.startsWith(" ")){
            System.out.println("Valid Password");
    }else {
            System.out.println("Invalid Password");

        }












































}
}