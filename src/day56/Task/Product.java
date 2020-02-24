package day56.Task;

public class Product {
    private String name;
    private int price;

    public Product(String name,int price){
        this.name=name ;
        this.price=price;
    }
    @Override
    public boolean equals(Object obj){
        Product otherproduct=(Product)obj;

        return this.name.equals(otherproduct.name)&&this.price==otherproduct.price;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price=price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
