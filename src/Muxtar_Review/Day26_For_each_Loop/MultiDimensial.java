package Muxtar_Review.Day26_For_each_Loop;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MultiDimensial {
    public static void main(String[] args) {
        int [] arr1D={1,2,3,4};
        int [][] arr2D ={{1,2,3,4},{4,6,7,8}};
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(arr2D));

        for (int [] each1:arr2D){
            for (int each2:each1){
                System.out.println(each2);
            }
        }


        int [][][] num3D={{{1,2},{2,3,4}},{{4,8,9},{8,4,5}}};
        for (int[][] firstarr:num3D){
            for (int [] secondarr:firstarr){
                for (int thirdarr:secondarr){
                    System.out.print(thirdarr);
                }
            }
        }


        List<Integer> listint=new LinkedList<>(Arrays.asList(1,2,5,8,9));
        for (int i = listint.size()-1; i >=0 ; i--) {
            System.out.println(listint.get(i));
        }


        System.out.println(listint);



    }
}
