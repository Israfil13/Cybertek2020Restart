package day20;

public class SumofOdd {
    public static void main(String[] args) {
        int counter=0;
        int sum=0;
        for (int i = 10; i <=100 ; i++) {
          if (i%2==1)//(i%2!=0)
              sum += i;
        ++counter;
        }
        System.out.println("sum of odd number :"+ sum);
        System.out.println(counter);

    }
}
