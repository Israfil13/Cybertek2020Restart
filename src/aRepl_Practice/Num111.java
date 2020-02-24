package aRepl_Practice;

public class Num111 {
    public static void main(String[] args) {
        int k = 1;
        int total = 0;

            do {  int square=k*k;
                System.out.println(square);
       ++k;
       total=total+square;
            }while(k<=50);
        System.out.println(total);


    }
}
