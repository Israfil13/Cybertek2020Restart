package day56.Task;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    List<Product> allproducts;

    public Store (){
        this.name="Cybertek";
        this.allproducts=new ArrayList<>();
    }

    public Store (String name,List<Product>otherlist){
        this();
        this.name=name;
        allproducts.addAll(otherlist);
    }

    public void addProduct(Product p){
        allproducts.add(p);
    }

    public void addProduct(String productName,int productPrice){
        Product newP=new Product(productName,productPrice);
        allproducts.add(newP);
    }

    public void displayproduct(){
        for (Product each:allproducts){
            System.out.println("each = " + each);
        }
    }



    public boolean checkifProductexist(Product p){
        return allproducts.contains(p);
    }


    public void  removeProdut(Product p){
        if (checkifProductexist(p)==true){
            allproducts.remove(p);
        }else {
            System.out.println("We dont have"+p);
        }
    }


    public int sumofAllProductPrice(){
        int sum=0;
        for (Product each:allproducts){
            sum+=each.getPrice();
        }
   return sum;
    }

    public double average(){
        return sumofAllProductPrice()/allproducts.size();
    }

    public Product findmax(){
        Product maxproduct=null;
        int max=Integer.MIN_VALUE;
        for (Product each:allproducts){
            if (each.getPrice()>max){
                max=each.getPrice();
                maxproduct=each;
            }
        }
         return maxproduct;

    }



    public List<Product> morethanaverage(){
        List<Product> morethanaverage=new ArrayList<>();

        for (Product each:allproducts){
            if (each.getPrice()>average()){
                morethanaverage.add(each);
            }
        }
        return morethanaverage;
    }








    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allproducts=" + allproducts +
                '}';
    }
}
