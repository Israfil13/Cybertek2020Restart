package aRepl_Practice;

public class Carpet_Action {
    public static void main(String[] args) {
        Carpet c = new Carpet();
        System.out.println(c.totalPrice);
        Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,true);
       System.out.println(c2.totalPrice);
//        c2.setTotalPrice();
    }
}
