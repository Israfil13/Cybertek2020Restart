package Practice;

import day35.SumofIntgers;

import java.util.*;

public class Iterating {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,54,6,8));

        Iterator<Integer> ite=nums.iterator();

        ite.hasNext();
        while (ite.hasNext()){
            System.out.println(ite.next());
            if (ite.next()>10){
                ite.remove();
            }
        }
        nums.replaceAll(each->each+5);
//        nums.sort(Collections.sort(nums));
        System.out.println(nums);
        System.out.println(nums.subList(2, 4));
        List<Integer>sunnums=nums.subList(1,4);
        sunnums.set(2,9);
        System.out.println(sunnums);
        System.out.println(nums);
        System.out.println("-----------------------");
        ListIterator<Integer> listIt=nums.listIterator();
        listIt.nextIndex();
        while (listIt.hasNext()){
            System.out.print("listIt.nextIndex() = " + listIt.nextIndex());
            System.out.print(listIt.next());

        }

        System.out.println("listIt.hasPrevious() = " + listIt.hasPrevious());
        System.out.println("listIt.previousIndex() = " + listIt.previousIndex());
        System.out.println("listIt.previous() = " + listIt.previous());

        while (listIt.hasPrevious()){
            System.out.println(listIt.previousIndex());
            Integer item=listIt.previous();
            System.out.println("Item = "+item);
        }




    }
}
