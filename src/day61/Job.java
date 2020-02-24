package day61;

public class Job implements Comparable<Job>{
    private String location;
    private int salary;
   private String companyname;

   public Job(String location,int salary,String companyname){
       this.location=location;
       this.salary=salary;
       this.companyname=companyname;
   }

   public  String getLocation(){
       return location;
    }

    public void setLocation(String location){
       this.location=location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyname='" + companyname + '\'' +
                '}';
    }



    public int compareTo(Job otherjob) {
        if (this.salary>otherjob.salary){
            return 1;
        }else if (this.salary<otherjob.salary){
            return -1;
        }else {
            return 0;
        }
    }

//    public  compareTo(Job otherjob) {
//        if (this.location>otherjob.location){
//            return 1;
//        }else if (this.salary<otherjob.salary){
//            return -1;
//        }else {
//            return 0;
//        }
    }



