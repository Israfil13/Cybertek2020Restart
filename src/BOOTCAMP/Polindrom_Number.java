package BOOTCAMP;

public class Polindrom_Number {

    public static void main(String[] args) {
        System.out.println(ispolindrom(12521));
    }

    public static boolean ispolindrom(long num){
      long remain=num;
      long rev=0;

      while ( remain !=0){
          long digit=remain % 10;
         rev= rev*10+digit;
         remain/=10;

      }

        return num == rev;

    }
}
