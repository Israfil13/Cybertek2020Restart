package day58;

public class CheckExceptionDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Checeked Exception in next line");
        try{
        Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("exception was caught");
        }
        System.out.println("After thread.sleep ");


    }
}
