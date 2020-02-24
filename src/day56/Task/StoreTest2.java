package day56.Task;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {
    public static void main(String[] args) {

        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5));
        Store s2=new Store("Denis's Store",denisList );
        System.out.println("s2 = " + s2);

        s2.addProduct(new Product("Cheescake",10));
        s2.addProduct("Bulka",1);
        System.out.println("s2 = " + s2);

        s2.displayproduct();

        System.out.println("s2.checkifProductexist() = " + s2.checkifProductexist(new Product("Cheescake",10)));

        s2.removeProdut(new Product("muffins", 5));

    }
}
