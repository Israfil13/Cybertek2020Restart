package day27;

import java.util.Arrays;

public class MultidimensionalArraysPractice {
    public static void main(String[] args) {
        String [][]names={{"Rukshsona","Goya"},{"Hasan","Tetiana"}};

        System.out.println(names[1][0]);

  names[1][0]="Dilshat";
        System.out.println(names[1][0]);

        System.out.println(Arrays.toString(names[1]));
        System.out.println(Arrays.deepToString(names));


        int[][]numbers={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <numbers.length ; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.println(numbers[i][j]);
            }
            //            System.out.println(Arrays.toString(numbers[i]));

        }


        int[][] ages={ {10}, {12,13,14,16,17}, {19,20,21,22,23}  };
        for (int i = 0; i <ages.length ; i++) {

            for (int j = 0; j <ages[i].length ; j++) {
             if (ages[i][j]%2!=0)  {
                 continue;

             }System.out.println(ages[i][j]);
            }

        }


        int[][] arr2D={{10,20,30},{40,50,60,70,80,90,100}};
        for (int[] each:arr2D){
            for (int eachelemnet:each){
            System.out.println((eachelemnet));
        }
        }





    }
}
