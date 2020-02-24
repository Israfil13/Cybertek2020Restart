package day27;

public class ArrayTaskMInMax {
    public static void main(String[] args) {

        int[] scores={12,56,78,100,55};
        int max=scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println("max = " + max);
        int min=scores[0];
        for (int eachnum:scores)     {
            if (eachnum<min){
                min=eachnum;
            }
        }
        System.out.println("min = " + min);


            int secondmin=scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]==min){
                continue;
            }else
            secondmin=scores[i];
        } System.out.println("secondmin = " + secondmin);

        int thirdmin=0;
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]==min || scores[i]==secondmin ){
                continue;
            }else
                thirdmin=scores[i];
        } System.out.println("thirdmin = " + thirdmin);






    }
}
