package day57.Muxtar_Task;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Before try catch: ");
        try {
            int result = 10 / 0;
        }catch (ArithmeticException e){

            System.out.println("Exception happened and was handled");
        }
        System.out.println("After try catch");

        try {
            System.out.println("In second Try block");
            String str="Java is fun ";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Exceprion caught and handeled");
        }


        System.out.println("After secon try catch");



    }
}
