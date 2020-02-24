package day06;

public class CompoundOperator3Remainder {
    public static void main(String[] args) {
//        int bankBalance = 1140;
//        System.out.println("I have spent half of it " + bankBalance);
//        bankBalance /=2;
//        System.out.println("nOw my balance is " + bankBalance);
//
//        bankBalance %=500;
//        System.out.println(" I want to divide the balance by 500 and keep remainder in my pocket");
//        System.out.println( " the remainder is :"+ bankBalance);


        int cent = 200;
        cent -=74;
        int quarter= cent/25;
        int penny = cent%25;

        System.out.println(quarter);
        System.out.println(penny);

        int dime= cent/10;
        int remainingPenny = cent%10;

        System.out.println(dime);
        System.out.println(remainingPenny);



        int kontur = 125;
        kontur /=3;
        System.out.println("1/3 part of my kontur " +kontur+ " to my bro");

        kontur %=2;
        System.out.println("half of the remaining kontur "+kontur+"  to my dude");










    }
}
