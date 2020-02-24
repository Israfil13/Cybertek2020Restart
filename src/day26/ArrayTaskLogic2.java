package day26;

public class ArrayTaskLogic2 {
    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 787, 87, 110};
        String finalResult = "";
        int countmorethan100 = 0;
        for (int eachnum:scores){
            if (eachnum<=100){
                finalResult="NO";
                break;
            }
        }
        System.out.println("finalResult = " + finalResult);

    }
}
