package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanONeValue {
    public static void main(String[] args) {
        String sentence="I love Java";
        char[] eachchars=sentence.toCharArray();
        String[] eachwords=sentence.split(" ");



//        int[] resultarr=retunrboysgirlsresult();
        System.out.println(Arrays.toString(retunrboysgirlsresult()));
    }

public static int[] retunrboysgirlsresult(){
        int [] boysgirlscount={56,52};
        return boysgirlscount;
}


}
