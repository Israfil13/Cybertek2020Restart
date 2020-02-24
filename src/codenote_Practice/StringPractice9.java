package codenote_Practice;

import java.util.Scanner;

public class StringPractice9 {
    public static void main(String[] args) {

//        Task 9:
//        Ask user to enter a valid URL in below format
//        www.blackfriday.com
//        Write a program to print first Index of .(dot)
//                and last index of .(dot)
//                and eventually print the domain
//        for example :
//        www.nightwatch.com  --->> blackfriday
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter URL");
        String url=scan.next();
        System.out.println(url.indexOf("."));
        System.out.println(url.lastIndexOf("."));
        System.out.println(url.substring(url.indexOf(".")+1,url.lastIndexOf(".")));












    }




}
