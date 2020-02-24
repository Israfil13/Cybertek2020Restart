package day34;

public class ReturnPractice {
    public static void main(String[] args) {
        printMin4harName("Jon");
        printMin4harName("Jon Shark");



    }

    public static void printMin4harName(String name){
        if (name.length()<4){
            System.out.println("Invalid Name");
           return;
        }
        System.out.println(name);

    }


}
