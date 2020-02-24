package day57.Muxtar_Task;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String studentname;

    public Student(String studentname){
        this.studentname=studentname;
    }

    @Override
    public String toString() {
        return
                "studentname=" + studentname;
    }
}


class  School{
      String schoolName;
      List<Student> allStudentList;

      public School(String schoolName,List<Student> allStudentList){
          this.schoolName=schoolName;
          this.allStudentList=allStudentList;
      }

      public void addStudent(Student s){
          allStudentList.add(s);
      }

      public void addAll(List<Student> stu){
          allStudentList.addAll(stu);
      }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", allStudentList=" + allStudentList +
                '}';
    }
}


class AssociationExample{
    public static void main(String[] args) {

        Student s1=new Student("Hasan");
        Student s2=new Student("Kamran");
        Student s3=new Student("Rauf");
        Student s4=new Student("Israfil");
        Student s5=new Student("Ilham The One");
        List<Student> cybertekStudents=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

        School mekteb=new School("Cybertek",cybertekStudents);

        mekteb.addStudent(new Student("Denis"));
        mekteb.addStudent(new Student("Irina"));

        List<Student> newstudent=new ArrayList<>(Arrays.asList(new Student("Denis"),new Student("Irina")));
        mekteb.addAll(newstudent);

        System.out.println(mekteb.allStudentList);

       for (Student each:mekteb.allStudentList){
           System.out.println(each);
       }

        System.out.println(mekteb);
    }

}