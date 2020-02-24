package day48;



public abstract class Employee {
    String name;
    int iD;

    public abstract void calculateSalary();

    public  abstract String toString();

    public Employee(String name,int iD){
        this.name=name;
        this.iD=iD;
    }

}
