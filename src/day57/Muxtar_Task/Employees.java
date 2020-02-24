package day57.Muxtar_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//    create an abstract class called employees:
//    instance variables: employeeName, employeeID, JobTitle
//    abstract method: working();
public abstract class Employees {

    String employeeName,jobTitle;
    int employeeID;

    public abstract void working();

    @Override
    public String toString() {
        return "Employees{" +
                "employeeName='" + employeeName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}

class Developers extends  Employees{
    public Developers(String employeeName,String jobTitle,int employeeID){
        this.employeeName=employeeName;
        this.jobTitle=jobTitle;
        this.employeeID=employeeID;
    }

    @Override
    public void working() {

    }
}


class Tester extends Employees{
    public Tester (String employeeName,String jobTitle,int employeeID){
        this.employeeName=employeeName;
        this.jobTitle=jobTitle;
        this.employeeID=employeeID;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "employeeName='" + employeeName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }

    @Override
    public void working() {

    }
}


class ScrumTeam{
    List<Developers> devTeam;
    List<Tester> testersTeam;

    public ScrumTeam(List<Developers> devTeam, List<Tester> testersTeam) {
        this.devTeam = devTeam;
        this.testersTeam = testersTeam;
    }

    public void addTester(Tester testers){
        testersTeam.add(testers);
    }
    public void addDev(Developers dev){
        devTeam.add(dev);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "devTeam=" + devTeam +
                ", testersTeam=" + testersTeam +
                '}';
    }
}


class BankfofAzerbaijan{
    public static void main(String[] args) {

        Tester t1 = new Tester("Kamran", "SDET", 10);
        Tester t2 = new Tester("Hasan", "SDET", 6);
        Tester t3 = new Tester("Rauf", "SDET", 9);
        Tester t4 = new Tester("Israfil", "SDET", 13);

        Developers d1 = new Developers("Maldini", "Left Back", 3);
        Developers d2 = new Developers("Baresi", "Central Back", 6);
        Developers d3 = new Developers("Nesta", "Central Back", 13);
        Developers d4 = new Developers("Tasotti", "Right Back", 2);

        List<Tester> neftci = new ArrayList<>(Arrays.asList(t1, t2, t3, t4));
        List<Developers> acMilan = new ArrayList<>(Arrays.asList(d1, d2, d3, d4));


        ScrumTeam s1 = new ScrumTeam(acMilan, neftci);

        s1.testersTeam.add(new Tester("Seedorf","Central Mild",20));
        s1.testersTeam.add(new Tester("Kaka","Attackin Mild",22));
        s1.testersTeam.add(new Tester("Shevchenko","Forward",7));

        s1.devTeam.add(new Developers("Gattuso","Central Mild",8));

        System.out.println("s1 = " + s1);

            for (Tester each:neftci){
                System.out.println(each);
            }
          for (Developers each:acMilan){
              System.out.println(each);
          }

    }
}