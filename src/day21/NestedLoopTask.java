package day21;

public class NestedLoopTask {
    public static void main(String[] args) {




            for (int x = 1; x <=4 ; x++) {
                System.out.println(x);
                for (int i = 1; i <=10 ; i++) {
                 if (i%2==0) {
                     continue;
                 }  System.out.print(i);
            }
                System.out.println();


        }




    }
}
