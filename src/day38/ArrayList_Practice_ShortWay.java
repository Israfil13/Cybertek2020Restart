package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Practice_ShortWay {
    public static void main(String[] args) {

        List<Double> mylist= Arrays.asList(5.99,8.45,3.33,8.2,5.99,5.57,9.99);
      int count=0;
        for (Double each:mylist){
            if (each>5.0){
                ++count;
            }
        }
        System.out.println(count);

        List<Double> mylist2=new ArrayList<>(mylist);
      mylist2.add(5.01);
      mylist2.remove(5.99);
        System.out.println(mylist2);

        List<Double> oneshotmylist=new ArrayList<>(Arrays.asList(5.99,8.45,3.33,8.2,5.99,5.57,9.99));
        oneshotmylist.add(1,100.99);
        oneshotmylist.remove(2);
        System.out.println(oneshotmylist);







    }
}
