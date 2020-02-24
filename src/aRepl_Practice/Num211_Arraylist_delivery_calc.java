package aRepl_Practice;

import java.util.ArrayList;

public class Num211_Arraylist_delivery_calc {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,4);
        System.out.print(times);
    }

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel)
    {

            int sum=0;
        for (Integer each:deliveries){
            sum+=each;
        }
            if (sum%max_fuel!=0) {
              return  (sum / max_fuel) + 1;
            }else {
                return sum/max_fuel;
            }





    }



}
