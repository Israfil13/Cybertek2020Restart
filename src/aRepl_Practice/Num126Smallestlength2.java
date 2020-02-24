package aRepl_Practice;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Scanner;

public class Num126Smallestlength2 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String str = " olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        str=str.replace(" ","");
        String strArray[]=str.split(",");
        System.out.println(Arrays.toString(strArray));

        String shortest="";
      int min=strArray[0].length();
        for (String eachitem:strArray){
           if (eachitem.length()<min){
               min=eachitem.length();
               shortest=eachitem;
           }
        }

        String smallest="";
        for (String eachshortest:strArray){
            if (eachshortest.length()==shortest.length()){
                smallest+=eachshortest+" ";

            }
        }
        String[] eachshortestarr=smallest.split(" ");
        Arrays.sort(eachshortestarr);
        System.out.println(Arrays.toString(eachshortestarr));




    }
}
