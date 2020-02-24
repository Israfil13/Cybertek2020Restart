package day27;

public class ArrayMax {
    public static void main(String[] args) {
        int[] scores={12,56,78,100,55};
        int max=scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println("max = " + max);

        int secondmax=scores[0];

        for (int i = 0; i <scores.length ; i++) {
            if (secondmax<scores[i] && scores[i]!=max){
                secondmax=scores[i];
            }

        }
        System.out.println("secondmax = " + secondmax);










    }
}
