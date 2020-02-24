package day19;

import javax.swing.*;
import java.util.Scanner;

public class repl88 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter start and end speed");
        int start=scan.nextInt();
        int end=scan.nextInt();
      if (start<end){
          for (int i = start; i<=end ; i++) {
              System.out.println(i+" , ");

          }
      }else if (start>end){
          for (int i = start; i>=end ; i--) {
              System.out.println(i+" , ");
      }


    }else {
          System.out.println("no action needed");      }
}}
