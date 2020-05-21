package Practice_Collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        List<Double> lst=new LinkedList<>();
        lst.addAll(Arrays.asList(4d,5d,44d,54d,2d,66d));

        lst.get(0);
        lst.add(1,5d);
        lst.add(8.0);
        System.out.println(lst);

        lst.set(0,44d);

        System.out.println("lst.indexOf(8.0) = " + lst.indexOf(8.0));
        System.out.println("lst.lastIndexOf(5.0) = " + lst.lastIndexOf(5.0));
        System.out.println("if item not found"+lst.indexOf(100.0));

        //remove(index)
        System.out.println("lst.remove(1) = " + lst.remove(1));

        lst.addAll(2,Arrays.asList(41d,1d));
        System.out.println(lst);

        //addding 5 to each item
        lst.replaceAll(each->each+5);

        System.out.println(lst);

        //sort ascending order
        lst.sort(null);
        System.out.println(lst);

        lst.sort(Comparator.naturalOrder());
        System.out.println(lst);

        lst.sort(Comparator.reverseOrder());
        System.out.println(lst);

        System.out.println(lst.subList(3, 6));

        List<Double> partofListView =lst.subList(2,5);
        System.out.println(partofListView);
        lst.set(2,199.99);
        System.out.println(partofListView);
        System.out.println(lst);


        ListIterator<Double> lstIter=lst.listIterator();
        System.out.println("lstIter.hasNext() = " + lstIter.hasNext());
        System.out.println("lstIter.nextIndex() = " + lstIter.nextIndex());

        while (lstIter.hasNext()){
          Double item =  lstIter.next();
            System.out.println(item);
        }

        System.out.println("lstIter.hasPrevious() = " + lstIter.hasPrevious());
        System.out.println("lstIter.previousIndex() = " + lstIter.previousIndex());
        System.out.println("lstIter.previous() = " + lstIter.previous());

        while (lstIter.hasPrevious()){
            System.out.println("lstIter.previousIndex() = " + lstIter.previousIndex());
           Double item = lstIter.previous();
            System.out.println("item = " + item);

            if (item<50){
                lstIter.remove();
//                lstIter.set(200.00);
                lstIter.add(1000D);
            }
        }
//        lst.sort(Comparator.naturalOrder());
        System.out.println(lst);

    }
}
