package day13;


import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class WarmUpAmazonCalculator2 {
    public static void main(String[] args) {

        boolean doyouWanttoShop = false ;
        String preference = "Store";

        if (doyouWanttoShop == true) {
            if (preference.equals("Store"))
            {
                System.out.println("Going to stroe for shopping");
            } else{
                System.out.println("Going to online for shopping");
            }
        } else {
            System.out.println("good job do coding");
        }


        Scanner scan=new Scanner(System.in);
        System.out.println("Whic country do you love?");
        String country = scan.next();

        if (country.equals("Italy")){
            System.out.println(" I love Italy");
            System.out.println("Which CIty");
            String city=scan.next();
            if (city.equals("Roma")) {
                System.out.println("ROma is the best");
            }else {
                System.out.println("I does not matter");
            }
        }else{
            System.out.println("All of them");
        }

    }
}


