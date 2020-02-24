package day31;

public class AdultChecker {
    public static void main(String[] args) {

        vote(29);
        vote(16);

        int yourage=15;
        vote(yourage);
        vote(80);
    }


    public static void vote(int age){

//        int age=15;
        if (age>18){
            System.out.println("you are eligible");
        }else
        System.out.println("You are not elgible");
    }












}
