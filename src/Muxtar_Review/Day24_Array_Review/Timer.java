package Muxtar_Review.Day24_Array_Review;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int minutes=scan.nextInt();

        for (int i = minutes; i >0 ; i--) {
            if (i<0)
                break;
            for (int j = 59; j >0 ; j--) {
                System.out.println((i-1) + " minutes and "+ j + " seconds left");
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}
