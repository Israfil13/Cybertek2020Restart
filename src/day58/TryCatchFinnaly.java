package day58;

public class TryCatchFinnaly {
    public static void main(String[] args) {
        System.out.println("before try catch");
        try{
            System.out.println("hello from try block");
            String str=null;
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("exception happened and caught");
        }finally {
            System.out.println("Finallay block.runs even if there is exception or no exception");
        }
        System.out.println("After try catch");
    }
}
