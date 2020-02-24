package day58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class NoBreakTimeException extends RuntimeException {
    public static void main(String[] args) {

        int [] arr={1,2,3};
     try {
         System.out.println(arr[20]);
         System.out.println("checked exception");
     }catch (Exception e){
         System.out.println("Unchecekd exception");
     }


        System.out.println("Work done");

        try {
            Thread.sleep(2000);
            System.out.println("Try block,Checked exception");
        }catch (Exception e){
            System.out.println("catch block,unchecked");
        }


        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3));

     try {
         System.out.println(list.get(10));
         System.out.println("checked exception");
     }catch (Exception e){
         System.out.println("unchecked exception happened");
     }













}

    public static void method(String kfc){

    }
}
