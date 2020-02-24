package day21;

public class LoopControl {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if (i%5==0){
             //  System.out.println("Skipping" + i);
                continue;
            }
            System.out.println(i);

        }

        for (int i = 0; i <=100 ; i++) {
            if (i%5!=0){
                System.out.println(i);
            }else{
                System.out.println("skipping"+i);
            }
        }

    }
}
