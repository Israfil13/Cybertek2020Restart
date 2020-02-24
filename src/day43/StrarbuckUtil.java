package day43;

public class StrarbuckUtil {
    public static void main(String[] args) {
        Coffee c1=new Coffee("Blonde", 5, 1.6);
        printCoffeInfo(c1);
        String myString=new String("Hello");
        printStringinfo(myString);

        Coffee c2=new Coffee();
        printCoffeInfo(new Coffee("Infensito",10,0));

        //        StrarbuckUtil star=new StrarbuckUtil();
//        star.printStringinfo(myString);
    }

    public static void  printCoffeInfo(Coffee co){
        System.out.println("This coffe is : "+co.getType());
        System.out.println("Price is "+co.getPrice());
        System.out.println("Coffeninlevel is "+co.getCaffeineLevel());
    }


    public static void printStringinfo (String str){
        System.out.println("first caracter "+str.charAt(0));
        System.out.println("last caracter "+str.charAt(str.length()-1));
    }

}
