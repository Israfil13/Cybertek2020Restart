package Naveen.Collection_Framework_ArrayList;

import codenote_Practice.Arraylist_Practice_Character;
import com.sun.source.tree.LiteralTree;
import day22.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
class Employee{
    String name;
    int age;
    String position;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}



public class ArrralistConcept {
    public static <E> void main(String[] args) {

        int[] a=new int[3];//static array

        ArrayList arrl=new ArrayList<>();
        arrl.add(3);

        ArrayList<E>ar3=new ArrayList<E>();
        
        Employee e1=new Employee("ISrafil",29,"SDET");
        Employee e2=new Employee("Kamran",25,"SDET");
        Employee e3=new Employee("Hasan",34,"SDET");
        
        List<Employee> emp=new ArrayList<>(Arrays.asList(e1,e2,e3));
//        for (Employee each:emp){
//            System.out.println("each.toString() = " + each);
//        }

        Iterator<Employee> empit=emp.iterator();
        while (empit.hasNext()){
           Employee em=empit.next();
            System.out.println(em);
        }

        ArrayList<String> arr5=new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> arr6=new ArrayList<>(Arrays.asList("s","b","d"));

        arr5.retainAll(arr6);
        System.out.println(arr5);
        
        
        
        
        
        
        
        
    }



}
