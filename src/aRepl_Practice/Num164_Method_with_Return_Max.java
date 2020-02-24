package aRepl_Practice;

public class Num164_Method_with_Return_Max {
    public static void main(String[] args) {
        System.out.println(max(15,5));
    }
    public static int max(int x,int max){
        if (x>max){
            return max;
        }else {
            return x;
        }


    }
}
