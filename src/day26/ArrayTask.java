package day26;

public class ArrayTask {
    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 787, 87, 110};
        String finalResult = "";
        int countlessthan100 = 0;
        int countYES = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 100) {
                countlessthan100++;

            }

            }
        if (countlessthan100>0){
            System.out.println(finalResult+"NO");
        }

        System.out.println(countlessthan100);


    }
}
