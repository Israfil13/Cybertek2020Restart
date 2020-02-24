package day27;

public class MultiDimenMaxMin {
    public static void main(String[] args) {

        int[][] numbers={{10,12,80,65},{55,4,126,20},{55,11,6}};
        int min=numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (min>numbers[i][j]){
                    min=numbers[i][j];
                }
            }

        } System.out.println(min);















    }
}
