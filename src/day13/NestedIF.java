package day13;

public class NestedIF {
    public static void main(String[] args) {

        String memberType="Member";
        double amount=15.99d;
        int shippingfee= 0;

        if(memberType.equalsIgnoreCase("prime member")){
            System.out.println("You get one day free shipping");
            System.out.println("Your final Price is "+ amount);
        } else if (!memberType.equalsIgnoreCase("prime member" )&& amount>25.00) {

            System.out.println("Not a Prime member but your order is more than 25");
            System.out.println("You got free shipping on amount "+ amount);
        }else {
            System.out.println("Dou you wanna sign for membership");
            shippingfee=5;
            amount+=5;
            System.out.println("Your final amount is " + amount);
        }


    }
}
