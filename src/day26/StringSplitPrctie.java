package day26;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringSplitPrctie {
    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan"   ;
        students=students.replace(" ","");
        String[]namesArray=students.split(",");
        System.out.println(Arrays.toString(namesArray));


        for (int x = 0; x <namesArray.length ; x++) {

            String name=namesArray[x];
            System.out.println("name = " + name);
          for (int i =0; i <name.length(); i++) {
              System.out.print(name.charAt(i)+"-");

          }
            System.out.println();
      }


        

    }}

