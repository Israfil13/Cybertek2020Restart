package day11;

public class StringEqualityPractise {
    public static void main(String[] args) {

        System.out.println("Java".equals("java")    );

        String myStr= "Java";
        System.out.println(myStr.equals(myStr));
        String yourStr=new String("Java");
        System.out.println("is my string same as your string?");
        System.out.println(myStr.equals(yourStr));
        System.out.println(myStr!=yourStr);
        if (myStr.equals("Java")) {
            System.out.println("COrrect word");
        }else {
            System.out.println("SAY JAVAAA");
        }


    }
}
