package day20;

public class SumOddSumEven {
    public static void main(String[] args) {
        int counter = 0;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {//(i%2!=0){
                sumEven += i;
                ++counter;
            } else {
                sumOdd += i;
            }

            //  System.out.println(counter);
        }
        System.out.println("sum of even number :" + sumEven);
        System.out.println("sum of even number :" + sumOdd);

    }
}
