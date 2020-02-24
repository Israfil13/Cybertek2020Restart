package day48;

public class FullTimeEmployee extends Employee{
    double monthlysalary;
//    double annualsalary;

    public FullTimeEmployee(String name,int iD,double monthlysalary){
      super(name, iD);
        this.monthlysalary=monthlysalary;
    }

    public  void calculateSalary(){
        System.out.println( 12*monthlysalary);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlysalary=" + monthlysalary +
                ", annualsalary=" + 12*monthlysalary +
                ", name='" + name + '\'' +
                ", iD=" + iD +
                '}';
    }
}

