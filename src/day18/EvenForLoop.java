package day18;

public class EvenForLoop {
    public static void main(String[] args) {


        for (int x=1; x<=20;x+=3){
            System.out.println(x);
        }

        for (int i = 0; i <100 ; i++) {
            if (i%2==0){
                System.out.println(i+" is even number");
            }
        }
        for (int i = 0; i < 100; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Fizz Buzz number");
            }

        }

    }
}
