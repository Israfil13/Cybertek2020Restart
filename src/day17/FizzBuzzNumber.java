package day17;

public class FizzBuzzNumber {
    public static void main(String[] args) {

//        int num =15;
//        if (num%5==0 && num%3==0){
//            System.out.println("Fizz BUzz number");
//        }else if (num%5==0){
//            System.out.println("Fizz number");
//        }else  if (num%3==0){
//            System.out.println("BUzz Number");
//        }
        int num =1;

        while(num<=50){
            if (num%5==0 && num%3==0){
            System.out.println(num+" is Fizz BUzz number");
        }else if (num%5==0){
            System.out.println(num + " is Fizz number");
        }else  if (num%3==0){
            System.out.println(num + " is BUzz Number");
        }else {
                System.out.println("None of them");
            }
            ++num;
        }






    }
}
