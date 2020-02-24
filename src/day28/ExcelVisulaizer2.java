package day28;

import java.util.Arrays;

public class ExcelVisulaizer2 {
    public static void main(String[] args) {
//                                0          1        2
        int[][] myexcel={{10,27,88,99},{87,100},{90,45,65}};


        System.out.println(Arrays.deepToString(myexcel));

        for (int[]eachrow:myexcel ){
            for (int eachcell:eachrow){
                System.out.print(eachcell+" ");

            }
            System.out.println();
        }


    }
}
