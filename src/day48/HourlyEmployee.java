package day48;

import day48.Employee;

public class HourlyEmployee extends Employee {
    int hourlyWage;
    int numsofHours;
    int annualsalary;

    public HourlyEmployee(String name,int iD,int hourlyWage,int numsofHours){
        super(name,iD);
        this.hourlyWage=hourlyWage;
        this.numsofHours=numsofHours;
    }


    public  void calculateSalary(){
        System.out.println(annualsalary = hourlyWage*numsofHours*52);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsofHours=" + numsofHours +
                ", annualsalary=" + annualsalary +
                ", name='" + name + '\'' +
                ", iD=" + iD +
                '}';
    }

}
