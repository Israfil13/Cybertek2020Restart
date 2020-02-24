package day22;

public class LookingThroughArray {
    public static void main(String[] args) {
        int[]scores=new int[4];

        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

//      int itemcount= scores.length;
        for (int i =scores.length-1; i>=0 ; i--) {
            System.out.println(scores[i]);
        }





    }
}
