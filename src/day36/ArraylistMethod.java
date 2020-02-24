package day36;

import java.util.ArrayList;

public class ArraylistMethod {
    public static void main(String[] args) {
        ArrayList<Long> list=new ArrayList<>();
        list.add(12l);
        list.add(100l);
        list.add(150l);
//        list.add(null);

        
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));


     long sum=0;
     long max=0;

        for (Long each:list){
            sum+=each;
            if (max<each){
                max=each;
            }
        }

        list.add(2,125l);
        list.set(3,115l);
        list.remove(1);
        list.remove(12l);

        System.out.println(list);
        System.out.println(sum);
        System.out.println(max);
        System.out.println("location of 125L is"+list.indexOf(125l));
        System.out.println("lis is emplty = "+list.isEmpty() );
        System.out.println(list.size()>0);
        System.out.println("list.contains() = " + list.contains(125l));//        list.clear();
        System.out.println("Dou i have 10L = " + (list.indexOf(10l)!=-1));



//        System.out.println("list is empty ="+ list.isEmpty());l




    }
}
