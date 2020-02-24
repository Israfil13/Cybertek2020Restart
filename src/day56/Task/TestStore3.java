package day56.Task;

import java.util.Arrays;
import java.util.List;

public class TestStore3 {
    public static void main(String[] args) {

        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5));
        Store s2=new Store("Denis's Store",denisList );
        System.out.println("s2 = " + s2);
        System.out.println("s2.sumofAllProductPrice() = " + s2.sumofAllProductPrice());
        System.out.println("s2.average() = " + s2.average());

        System.out.println("s2.findmax() = " + s2.findmax());

        System.out.println("s2.morethanaverage() = " + s2.morethanaverage());

    }

}
