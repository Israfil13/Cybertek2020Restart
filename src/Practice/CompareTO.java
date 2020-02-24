package Practice;

import java.util.*;

public class CompareTO {
    public static void main(String[] args) {
        List<String> lst= new ArrayList<>(Arrays.asList("Lala","Sohrab","Israfil","Nigar"));


        lst.sort(Comparator.reverseOrder());
        System.out.println(lst);

        Collections.sort(lst,Collections.reverseOrder());
        System.out.println(lst);

        List<Person> person=new ArrayList<>();
        Person p1=new Person("Adam",11);
        Person p2=new Person("John",21);
        Person p3=new Person("Sara",18);
        Person p4=new Person("Sara",19);
        person.addAll(Arrays.asList(p1,p2,p3,p4));

//        Collections.sort(person);
//        System.out.println(person);

//        Comparator<Person>compa=new PersonNameComparator();
//        Collections.sort(person,compa);
//        System.out.println(person);

      Comparator<Person>agecompa=Comparator.comparing(p->p.age);
      Collections.sort(person,agecompa);
        System.out.println(person);

        Comparator<Person>nameCompa=Comparator.comparing(p->p.name);
        Collections.sort(person,nameCompa);
        System.out.println(person);

        Comparator<Person> nameadnageCOM=agecompa.thenComparing(nameCompa);
        Collections.sort(person,nameadnageCOM);



    }


}
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person other) {

        return (this.name.compareTo(other.name)==0 ? Integer.compare(this.age,other.age):
                this.name.compareTo(other.name));
        };
//       if (this.name.charAt(0)>other.name.charAt(0)){
//           return 1;
//       }else if (this.name.charAt(0)==other.name.charAt(0)){
//
//           if (this.age>other.age){
//               return 1;
//           }else if (this.age==other.age){
//               return 0;
//           }else {
//               return -1;
//           }
//
//       }else{
//           return -1;
//       }



}



class PersonNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}