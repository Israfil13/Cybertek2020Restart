package aRepl_Practice;

public class Num168_Method_with_Return_waterbill {
    public static void main(String[] args) {
        System.out.println(waterTax(101));
    }
    public static double waterTax(double units)
    {
        double bill = 0.0;
        //your code here
//    if (units<=50){
//        bill=units*0.60;
//    } else if (units > 50) {
//        bill=units*0.90;
//    }else  if (units>100){
//        bill=units*0.9+50;
//    }else if (units>150) {
//        bill = (units * 0.90) + 100;
//    }
        if (units>150) {
            bill = units * 0.9 + 100;
        }else  if (units>100){
            bill=units*0.9+50;
        }else if (units>50){
            bill=units*0.9;
        }else if (units<=50){
            bill=units*0.6;
        }




        //end your code here
        return bill;
    }//end waterTax
}
