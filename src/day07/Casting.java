package day07;

public class Casting {
    public static void main(String[] args) {

    //int num=10;
    double bignum=10;

        System.out.println(bignum);

        //int num=12.99; // compiler error

        int num = (int) 12.99;
        System.out.println(num);

        double number= 11.99;
        int numero=(int)number;
        System.out.println(numero);

        int nomre = 5;
        float nomre2= nomre ;
        System.out.println(nomre2);

        long earthtoMoon=10000000;
        int earttoMoon1= (int) earthtoMoon;
        System.out.println(earthtoMoon);

int aa=159000;
short bb=(short)aa;
        System.out.println(bb);














    }
}
