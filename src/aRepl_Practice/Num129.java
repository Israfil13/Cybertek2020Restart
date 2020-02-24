package aRepl_Practice;

import java.util.Arrays;

public class Num129 {
    public static void main(String[] args) {
//        String fewvalues="";
        String [] fevaluesarr={};
        String[] numbers = {"zero", "one", "two","three","four"};
     int ecount=0;
      for (String e:numbers){
          if (e.contains("e")){
              ++ecount;
          }
      }

        int k=0;
        String[] fewvalues =new String[ecount];
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i].contains("e")){
                fewvalues[k]=numbers[i];
                ++k;
        }

        }
        System.out.println(Arrays.toString(fewvalues));


    }
}
