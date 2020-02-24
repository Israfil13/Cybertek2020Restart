package aRepl_Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NUm83 {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Premium?");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("How many books?");
        int nbooksPurchased = scan.nextInt();

//        if (isPremiumCustomer==true){
//           {if (nbooksPurchased>=5 && nbooksPurchased<=11){
//               System.out.println(++freeBooks);
//            }else  if (nbooksPurchased>=7){
//               System.out.println(freeBooks+=2);
//           }}
//
//    }else if (isPremiumCustomer!=true){
//            if (nbooksPurchased>=7 && nbooksPurchased<12){
//                System.out.println(++freeBooks);
//            }else if (nbooksPurchased>=12){
//                System.out.println(freeBooks+=2);
//            }else{
//                System.out.println("0");
//            }
//        }


        if (isPremiumCustomer==true){
            if (nbooksPurchased>=8){
                System.out.println(freeBooks+=2);
            }else if(nbooksPurchased>=5){
                System.out.println(freeBooks++);
            }
        }





    }}
