package day03;

public class Primitive_Integer {
    public static void main(String[] args) {

        int catCount = 20;

        byte letterCount = 26;
        System.out.println("The letter count is "+ letterCount );

        short sheepCount = 300;
        System.out.println("Sheep count is "+ sheepCount);

        long  mileToSun = 150000;
        System.out.println("Mile to Sun is  "+ mileToSun   );

        long  miletoMoon = 1000000L;
        System.out.println("Mile to Moon is "+ miletoMoon);

        //you must add f at the end of number to indicate this is float data type
        float priceofBanana = 1.99f;
        System.out.println("Price of banana is "+ priceofBanana);

        float priceofPotato = 2.49F;
        System.out.println("Price of potato is " + priceofPotato);

        double priceofIpad = 355d ;
        System.out.println("Price of Ipad is "+ priceofIpad);

        double priceofIpadPro = 1024.99D;
        System.out.println("Price of Ipad Pro is "+ priceofIpadPro);

        double priceofMac = 2299.99 ;
        System.out.println("Price of Mac is "+ priceofMac);
        //if you have whole number by itself, compiler automayically assume it is an int
        //if you have fractional number by itself, compiler automayically assume it is an double




    }




}
