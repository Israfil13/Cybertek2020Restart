package BOOTCAMP;

public class PrimeNumber {

    public static void main(String[] args) {
        primeNumber(100);
    }

    public static void primeNumber(int nums){
        for (int i = 2; i <=nums; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime (int number){

        for (int i = 2; i <number ; i++) {
            if (number % i==0) return  false;
        }
        return true;
    }
}
