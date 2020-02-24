package day06;

import java.util.Scanner;

public class UsingTheValueOfVariable {
    public static void main(String[] args) {
        int myfavoritenumber=13 ;
        int yourfavnumber=myfavoritenumber ;

        System.out.println("my favorite number "+ myfavoritenumber);
        System.out.println("your favorite number "+ yourfavnumber);

        yourfavnumber=15;

        System.out.println("my favorite number "+ myfavoritenumber);
        System.out.println("your favorite number "+ yourfavnumber);

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your order?");
        String yourOrder=scan.next();
        String myOrder=yourOrder;
        System.out.println("Then my order is " + yourOrder + " too");

        System.out.println("what is your fav movie?");
        String yourfavmovie = scan.next();
        String myfav=yourfavmovie;
        System.out.println("My fav movie also" + myfav);
        System.out.println(myfav);





    }
}
