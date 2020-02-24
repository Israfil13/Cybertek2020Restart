package codenote_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Arraylist_Practice_Integer_reverse {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(5);
        mylist.add(3);
        mylist.add(2);
        mylist.add(8);
        mylist.add(9);
        doreverse(mylist);

    }


public static void doreverse (List<Integer> nums){
        int temp=0;
    for (int i = 0; i <nums.size()/2 ; i++) {
        temp=nums.get(i);
        nums.set(i,nums.get(nums.size()-1-i));
        nums.set(nums.size()-1-i,temp);

    }

    System.out.println(nums);
}


}
