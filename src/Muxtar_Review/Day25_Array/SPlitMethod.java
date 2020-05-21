package Muxtar_Review.Day25_Array;

import java.util.Arrays;

public class SPlitMethod {
    public static void main(String[] args) {
        String fullname="Cybertek School Batch15";
        String[] arrays=fullname.split(" ");
        System.out.println(Arrays.toString(arrays));


        String java ="I love Java and Java is fun, Java is Life";
        String [] arr2=java.split("Java");
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length-1);


        String email="Cybertek,school,batch15@gmail,com";
        email=email.substring(0,email.indexOf("@"));
        String []arremail=email.split(",");
        System.out.println(Arrays.toString(arremail));


    }
}
