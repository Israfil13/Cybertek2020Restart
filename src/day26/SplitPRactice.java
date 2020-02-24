package day26;

import day22.Array;

import java.util.Arrays;

public class SplitPRactice {
    public static void main(String[] args) {

        String survey="B15 Online 1 month survey";
        char[] surveychars=survey.toCharArray();
        System.out.println(Arrays.toString(surveychars));
        for (char eachchars:surveychars){
            System.out.println(eachchars);
        }
//        int i=0;
//        while (i<surveychars.length){
//            System.out.println(surveychars[i]);
//       ++i;
//        }
//
//        int y=0;
//        do {
//            System.out.println(surveychars[y]);
//            y++;
//        }while (y<surveychars.length);


        Arrays.sort(surveychars);
        System.out.print(Arrays.toString(surveychars));




    }
}
