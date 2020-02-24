package day52.Muxtar_Poly_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class ScrumTeam{
    String name,jobTitle;
    double salary;

  public   abstract void dailyStandUp();
  public  abstract void demo();
public void getEmployeeINfo(){
    System.out.println("Employee Name"+name);
    System.out.println("Job Title"+jobTitle);
    System.out.println("Salary"+salary);
}
}


class  Testers extends ScrumTeam {

    @Override
    public void dailyStandUp() {
        System.out.println("Tester "+name+"is talking");
    }

    @Override
    public void demo() {
        System.out.println("Tester "+name+"is doing demo");
    }

    public void findBug(){

    }

    public Testers(String name,String jobTitle, double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

}

class Developers extends ScrumTeam{

    public Developers(String name,String jobTitle,double salary)   {
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void demo() {

    }









}


public class BOA {
    public static void main(String[] args) {
        Testers t1=new Testers("Israfil","SDET",110000);
        Testers t2=new Testers("Hasan","Automation Tester",120000);
        Testers t3=new Testers("Kelem","Manual Tester",90000);

        Testers [] testers={t1,t2,t3};
        for (Testers each:testers){
            each.getEmployeeINfo();
        }


        t1.dailyStandUp();
        t1.getEmployeeINfo();

        ScrumTeam d1=new Developers("Kamran","Jr Dev",130000);
        ScrumTeam d2=new Developers("Maldini","Sr Dev",150000);
        ScrumTeam d3=new Developers("Boban","Sr Dev",140000);

        System.out.println(d1.jobTitle);
        ScrumTeam[]developers={d1,d2,d3};
         for (ScrumTeam each:developers){
             each.getEmployeeINfo();
         }

         ScrumTeam s1= new Testers("babangida","tester",1000000);
         s1.getEmployeeINfo();

        List<ScrumTeam>scrum= new ArrayList<>();
        scrum.addAll(Arrays.asList(testers));
        scrum.addAll(Arrays.asList(developers));

        for (ScrumTeam each:scrum){
            each.getEmployeeINfo();
        }



    }
}
