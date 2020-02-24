package day55.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    List<Product> lst;

    public Store (){
        this.lst=new ArrayList<>();
    }

    public Store(List<Product> lst){
        this();
        this.lst=lst;

        lst.addAll(lst);
    }

    public void addProduct(Product p){
        lst.add(p);
    }
    public void removeProduct(Product p){
        lst.remove(p);
    }


    public void checkIfProductExist(Product p){
        System.out.println("(lst.contains(p)) = " + (lst.contains(p)));
    }

    public static void main(String[] args) {
      Product p1=new Product("laptop",800);
      Product p2=new Product("phone",900);
      Product p3=new Product("book",130);
      Product p4=new Product("shoes",100);
      Product p5=new Product("TV",1800);

        Store s1=new Store(new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5)));

        s1.addProduct(new Product("sunglasses",50));



    }


}
//    It has List<Product> as instance variable
//    no arg constructor to initilize the list to empty ArrayList object
//        1 Arg constructor to accept List<Product>
//First line of constructor should call nonath constructor to reuse initialization logic.
//        Inside constructor AddAll Products user passed to the instance variable last.
//        Create an instance void method called addProduct(Product p)
//        Create an instance void method called removeProduct(Product p)
//        Create an instance void method called checkIfProductExist(Product p)
//        Hint : just call list remove method, it will internally call .equal method to decide which one to remove
//        more methods : find and return max price product, Find sum.of all products
//        Find list of products more than average  (edited)