package day37;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            nums.add(i);

        }
        System.out.println("nums = " + nums);

        for (int i = 0; i <nums.size() ; i++) {
            if (nums.get(i)%2!=0){
                nums.set(i,0);
            }
        }
        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));

        System.out.println("nums = " + nums);

        nums.add(0,100);

        List<Integer>list=new ArrayList<>();

        list.add(44);
        list.add(14);
        list.add(34);
        list.add(41);
        list.add(19);

        list.add(list.indexOf(34)+1,100);
        System.out.println("list = " + list);

        for (int i = 0; i <5; i++) {
            list.add(0,100);
        }
        System.out.println("list = " + list);

















    }
}
