package day39;

public class Student_Creation {
    public static void main(String[] args) {


        Student s1=new Student();
        s1.name="Karima";
        s1.age=18;
        s1.gender='F';

        System.out.println(s1.name);

        Student s2=new Student();
        s2.name="Juma";
        s2.age=31;
        s2.gender='M';

        System.out.println(s2.age);
        System.out.println(s1.age+s2.age);
        int oldage=s2.age;
        s2.age=29;
        System.out.println("oldage = " + oldage);
        System.out.println("The difference is " + (oldage-s2.age));




    }




}
