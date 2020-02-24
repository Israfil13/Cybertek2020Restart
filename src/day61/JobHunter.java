package day61;

import java.util.*;
import java.util.LinkedList;

public class JobHunter {
    public static void main(String[] args) {
        List<Job> jobs=new LinkedList<>();
        Job j1=new Job("Texas",100000,"WellsFargo");
        Job j2=new Job("N.Carolina",110000,"WellsFargo");
        Job j3=new Job("Virginia",115000,"WellsFargo");
        Job j4=new Job("California",130000,"Amazon");
        Job j5=new Job("Washington",120000,"WellsFargo");

        jobs.addAll((Arrays.asList(j1,j2,j3,j4,j5)));
        System.out.println("jobs = " + jobs);
        for(Job each:jobs){
            System.out.println("each = " + each);
        }
//        Collections.sort(jobs);
        System.out.println(jobs);
//        System.out.println(j1.compareTo(j3));

//        Collections.sort(jobs,Comparator.reverseOrder());
        System.out.println(jobs);

        Collections.sort(jobs,Collections.reverseOrder());
        System.out.println(jobs);





    }
}
