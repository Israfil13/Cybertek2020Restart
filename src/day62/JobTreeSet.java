package day62;

import day61.Job;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {
        Job j1=new Job("Texas",100000,"WellsFargo");
        Job j2=new Job("N.Carolina",120000,"WellsFargo");
        Job j3=new Job("Virginia",115000,"WellsFargo");
        Job j4=new Job("California",130000,"Amazon");
        Job j5=new Job("Washington",110000,"NellsFargo");

        SortedSet <Job> jobs=new TreeSet<>(Arrays.asList(j1,j2,j3,j4,j5));
        jobs.forEach(each-> System.out.print("each = " + each));
        System.out.println();
        System.out.print(jobs);

        Iterator<Job> jobite=jobs.iterator();
        while (jobite.hasNext()){
            Job j=jobite.next();
            System.out.println(j);
        }

    }
}
