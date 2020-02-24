package day44.day44sub;

import day44.Vehicle;

public class Car extends Vehicle {
    int mileage;

    public static void main(String[] args) {

        Car c1=new Car();
        c1.mileage=39637;
        c1.setYear(2016);
        System.out.println("c1.mileage = " + c1.mileage);
        c1.make="Toyota Corolla";
        System.out.println("c1 = " + c1);
    }


}
