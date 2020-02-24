package day50.office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    String brand;
    Engine e;
//    String[] names;
    List<String> passengers;


    public static void main(String[] args) {

        Car c1=new Car();
        c1.brand= new String( "toyota")  ;
        c1.e= new Engine("V6",270);
//        c1.names= new String[]{"Ziyoda","Mehtap","Rauf","Aykokul"};
        c1.passengers=new ArrayList<>(Arrays.asList("ZIyaoda","Raud"));
        System.out.println("c1 = " + c1);;



    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +
                ", names=" + passengers+
                '}';
    }
}
