package day10;

import javax.swing.*;
import java.util.Scanner;

public class Multi_Branch_Practise {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald, what can i get for you ");
        String order="";
        int itemNUmber= 35  ;
        if(itemNUmber==11){
            System.out.println("You have selected 11");
            order="Burger"; }
            else if(itemNUmber==5){
                System.out.println("You have selected 5");
                order="French fries"; }
            else if(itemNUmber==35){
                System.out.println("YAY");
                System.out.println("You have selected 35");
                order="Ice cream"; }
             else{
                System.out.println("You slected unknown item number");
                order="Unkown";}
            System.out.println("Your order is " + order);


            Scanner scanner=new Scanner((System.in));






    }

}





