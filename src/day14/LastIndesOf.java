package day14;

public class LastIndesOf {
    public static void main(String[] args) {

        String name= "Game of Java";
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf(" "));
        System.out.println(name.lastIndexOf("Game"));
        System.out.println(name.lastIndexOf("Kawa"));
//        String name="to day is very nice";
        System.out.println(name.lastIndexOf("i" ,5));



        if (name.indexOf("Kawa") > -1){
            System.out.println("Kawa is there");
        } else {
            System.out.println(" No Kawa");
        }


    }
}
