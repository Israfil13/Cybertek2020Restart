package day55.Task;

import javax.xml.namespace.QName;
import java.util.Objects;

public class Product {
    private String name;
    private double price;


    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }


    public boolean equals(Object obj){
     Product otherobj=(Product) obj;
       return this.name.equals(otherobj.name)&& this.price==(otherobj.price);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return Double.compare(product.price, price) == 0 &&
//                Objects.equals(name, product.name);
//    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
//    Create a class called Product with encapsulated fields name, price and constructor
//        override the .equals method coming from Object class :
//        Two products should be equal if they have the same fields value.
//        Practice Association: important
//        create a class called Store
//        It has List<Product> as instance variable
//        no arg constructor to initilize the list to empty ArrayList object
//        1 Arg constructor to accept List<Product>
//First line of constructor should call nonath constructor to reuse initialization logic.
//        Inside constructor AddAll Products user passed to the instance variable last.
//        Create an instance void method called addProduct(Product p)
//        Create an instance void method called removeProduct(Product p)
//        Create an instance void method called checkIfProductExist(Product p)
//        Hint : just call list remove method, it will internally call .equal method to decide which one to remove
//        more methods : find and return max price product, Find sum.of all products
//        Find list of products more than average  (edited)