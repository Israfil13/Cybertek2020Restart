package day52.WarmUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankTest {
    public static void main(String[] args) {
        Account a1=new Account("John SNow",1000);
        Account a2=new Account("Hannah",20000);
        Account a3=new Account("Andrea",200000);
        Account a4=new Account("Israfil",100);

        a1.transferAll(a2);
        System.out.println("a2 = " + a2);
        System.out.println("a1 = " + a1);

        a2.transferAll(a1);
        System.out.println("a1 = " + a1);
        System.out.println(a2.isPalindrome());


        List<Account> lst =new ArrayList<>();
        lst.add(a1);
        lst.add(a2);
        lst.add(a3);

        Collections.sort(lst);
        System.out.println("lst = " + lst);

        System.out.println( a1.compareTo(a2));

        for (Account each:lst){
          each.transferAll(a4);
        }
        System.out.println(a4);
    }
}
