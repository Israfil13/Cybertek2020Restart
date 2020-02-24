package day26;

public class ArrayTaskLogic1 {
    public static void main(String[] args) {
        int[] scores = {156, 101, 76, 787, 87, 110};
        String finalResult = "";
        int countmorethan100 = 0;
        for (int eachnum:scores){
            if(eachnum>100){
                ++countmorethan100;
            }
        }
        System.out.println("countmorethan100 = " + countmorethan100);
        if (countmorethan100==scores.length){
            finalResult="YES";
        }else{
            finalResult="NO";
        }
        System.out.println("finalResult = " + finalResult);

    }
}
