package day39;

public class Car {
   String model;
   String make;
   int year;
   String color;
 public void goForward() {
     System.out.println(make + "" + "Going forward");

 }

    public void caryear(){
        System.out.println(make+" age is "+ (2020-year));
    }

    public void changeColorto(String newcolor){
     color=newcolor;
    }





    public static void main(String[] args) {
        Car c1=new Car();
        c1.make="BMW";
        c1.model="535";
        c1.year=1995;
        c1.color="White";

        c1.goForward();
        c1.caryear();
        c1.changeColorto("Blue");

        Car c2=new Car();
        c2.make="MB";
        c2.model="C63";
        c2.year=2018;
        c2.color="Black";

        c2.goForward();
        c2.caryear();

        System.out.println(c1.make+","+c1.year+","+c1.model);
        System.out.println(c1.color);
        c2.color=c1.color;

        System.out.println("c2 = " + c2.color);
        System.out.println();




    }

}
