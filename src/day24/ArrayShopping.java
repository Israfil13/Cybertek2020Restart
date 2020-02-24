package day24;

import java.util.Arrays;

public class ArrayShopping {
    public static void main(String[] args) {

        String[] list={"apple","banana","grape","strawberry","blueberry","kiwi"};

        float[] price={ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };
        int lastitemindex=list.length-1;
        String lasfruit=list[lastitemindex];
       for (String grocaerylist:list){
            System.out.print(grocaerylist);
          if (!grocaerylist.equals(lasfruit))
            System.out.print("-->");
        }





        System.out.println();
        for (float grocaeryprice:price){
            System.out.print(grocaeryprice);
        }
        System.out.println();


        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(price));


    }
}
