package aRepl_Practice;

import java.util.Arrays;

public class kamran {
    public static void main(String[] args) {


        int[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4};
        String str = Arrays.toString(arr);
        str = str.substring(1,str.length()-1);
        String [] arrStr = str.split(", ");
        System.out.println(Arrays.toString(arrStr));
        String newStr = "";
        int counter = 0;
        for (String eachNum : arrStr) {
            if(!newStr.contains(eachNum)) {
                newStr+=eachNum;
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(newStr);

    }
}
