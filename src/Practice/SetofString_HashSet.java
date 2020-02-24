package Practice;

import java.util.HashSet;
import java.util.Set;

public class SetofString_HashSet {
    public static void main(String[] args) {

        System.out.println(new String("Adam").hashCode());
        System.out.println(new String("John").hashCode());

        Set<String> strset=new HashSet<>();
        strset.add("Adam");
        strset.add("John");


    }
}


class SetofPerson{
    public static void main(String[] args) {

        Set<Person> setpers=new HashSet<>();

        Person p1=new Person("John",20);
        Person p2=new Person("John",20);
        Person p3=new Person("John",20);
        Person p4=new Person("John",20);

        System.out.println(p1.hashCode() );
        System.out.println(p2.hashCode() );
        System.out.println(p3.hashCode() );

        setpers.add(p1);
        setpers.add(p2);
        setpers.add(p3);


        System.out.println(setpers);


    }
}