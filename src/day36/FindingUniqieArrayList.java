package day36;

import java.util.ArrayList;

public class FindingUniqieArrayList {
    public static void main(String[] args) {
        int num[]={11,23,44,23,33,55,78,15,55,15,1};
        ArrayList<Integer> uniquelis =new ArrayList<>();
        for (int eachnum:num){
            if (!uniquelis.contains(eachnum)){
                uniquelis.add(eachnum);
            }
        }

        System.out.println("uniquelis = " + uniquelis);



    }
}
