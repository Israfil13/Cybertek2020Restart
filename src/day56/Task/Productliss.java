package day56.Task;


import java.util.ArrayList;
import java.util.List;

public class Productliss {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();

        productList.add(new Product("Macbook Pro", 2999));
        productList.add(new Product("Sony TV", 499));
        productList.add(new Product("Macbook Air", 1299));
        productList.add(new Product("Iphone X", 999));
        productList.add(new Product("Iphone XL", 1299));
        productList.add(new Product("Sumsung 10", 1188));
        productList.add(new Product("Sumsung Note", 1288));

        System.out.println("productlist.size()= " + productList.size());

        boolean result=productList.contains(new Product("Sony TV",499));
        System.out.println(result);
        System.out.println("productList = " + productList.indexOf(new Product("Sony TV",499)));
        productList.remove(new Product("Sony TV",499));
        System.out.println("Has sony after removing"+productList.contains(new Product("Sony TV",499)));












        //        boolean result=false;
//        for (Product each:productlist) {
////            if (each.getName().equals("Sony Tv")&&(each.getPrice()==499)){
////                result= true;
////            }
////        }
//
//            if (each.equals(new Product("Sony Tv", 499))) {
//                result = true;
//
//            }
//        }
    }
}