package day27;

import java.util.Arrays;

public class MultiDimenArrays3d {
    public static void main(String[] args) {
        int[][][] arr3D={     {{1,2,3},{4,5,6}} , {{7,8,9},{10,11,12}}    };

        System.out.println(arr3D[1][0][2]);
        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(Arrays.deepToString(arr3D[1]));

        for (int i = 0; i <arr3D.length ; i++) {
            for (int j = 0; j <arr3D[i].length ; j++) {
                for (int k = 0; k <arr3D[i][j].length ; k++) {
                    System.out.println(arr3D[i][j][k]);
                }
            }
        }

        for (int[][] eacharr2D:arr3D){
            for (int[]eacharr:eacharr2D)
                for (int eachelement:eacharr){
                    System.out.println(eachelement);
                }
        }






    }
}
