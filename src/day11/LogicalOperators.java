package day11;

public class LogicalOperators {
    public static void main(String[] args) {

//        System.out.println("TRUTH TABLE");
//        System.out.println("RESULT OF TRUE && TRUE " + (true&&true));
//        System.out.println("RESULT OF FALSE && TRUE " + (false&&true));
//        System.out.println("RESULT OF TRUE && FALSE " + (true&&false));
//        System.out.println("RESULT OF FALSE && FALSE " + (false&&false));
//
//        System.out.println("RESULT OF TRUE || TRUE " + (true||true));
//        System.out.println("RESULT OF FALSE || TRUE " + (false||true));
//        System.out.println("RESULT OF TRUE || FALSE " + (true||false));
//        System.out.println("RESULT OF FALSE || FALSE " + (false||false));

          int num= 55  ;

        System.out.println(num<100||num>10||num<50);
        System.out.println(num<100&&num>10&&num<50);
        System.out.println( num==50 || num==51 || num ==55);
        System.out.println(num>50 && num!=52 || num==57);

        System.out.println(num ==55 || num>50 && num!=55 );

        System.out.println((num==55 || num>50) && num!=55 );
//        true false


    }
}
