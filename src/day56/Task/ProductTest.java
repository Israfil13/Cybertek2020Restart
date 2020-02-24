package day56.Task;

public class ProductTest {
    public static void main(String[] args) {
        Product p1=new Product("MacBook Pro",2999);
        Product p2=new Product("Sony Tv",499);
        Product p3=new Product("Sony Tv",499);
        Product p4=new Product("MacBook Pro",2999);
        Product p5=new Product("MacBook Pro",2999);
        Product p6=p5;
        System.out.println(p6.equals(p5));
        System.out.println(p2==p3);
        System.out.println(p2.equals(p3));

        System.out.println("ABC".equals(new String("ABC")));


    }
}
