package day21;

public class NestedLoopINtro {
    public static void main(String[] args) {

//        for (int i = 1; i <=5 ; i++) {
//            System.out.println(i);
//        }
//        System.out.println();

        for (int i = 1; i <=3 ; i++) {
            System.out.println("Iteration" + i);
            for (int x = 1; x <=5 ; x++) {
                System.out.print(x);
            }
            System.out.println();
        }

        for (int i = 1; i <=4 ; i++) {
            System.out.println(" level completed"+ i );

            for (int j = 1; j <=4 ; j++) {
                System.out.print(j);

            }
            System.out.println();

        }


    }
}
