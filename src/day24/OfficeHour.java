package day24;

import day22.Array;

import java.util.Arrays;

public class OfficeHour {
    public static void main(String[] args) {

        String[] cars = {"bmw","vw","audi"};
        for (String carMOdel:cars){
            System.out.println("i am done assinning the car " + carMOdel);
        }

        int[] ages={27,43,5,7,87};
        System.out.println(ages[3]-ages[2]);
        System.out.println(ages);
for (int agess:ages){
    System.out.println("ages" + agess);

}

        System.out.println(Arrays.toString(ages));




    }
}
