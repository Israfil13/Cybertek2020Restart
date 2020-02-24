package day17;

public class EvenNUmberFinder {
    public static void main(String[] args) {

        int num = 100;
        while (num >= 1) {
            if (num % 2 == 00) {
                System.out.println(num + " even number");
            }
            --num;
        }


        String name="ada ad a daaad daad";
        String name2=name.replace(" ","");
        int wordcount= name.length()-name2.length()+1;
        System.out.println(wordcount);



    }
}