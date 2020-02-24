package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceLIstPractice {
    public static void main(String[] args) {
        List<Double>priceList  = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        priceList.set(2,10.0);

        priceList.set(0,priceList.get(0)+4.00);
        System.out.println(priceList);

        double sum=priceList.get(0)+priceList.get(1);
        priceList.set(priceList.size()-1,sum);
        System.out.println(priceList);

        priceList.set(1,priceList.get(1)*0.6);
        System.out.println(priceList);

//        for (double eachprice:priceList){
//            System.out.println(eachprice*2);
//        }

        for (int i = 0; i <priceList.size() ; i++) {
            priceList.set(i,priceList.get(i)*2);
        }
        System.out.println("priceList = " + priceList);

        for (int i = 0; i <priceList.size() ; i++) {
            if (priceList.get(i)>20){
                priceList.set(i,priceList.get(i)/2);
            }
        }
        System.out.println("priceList = " + priceList);

        double temp=priceList.get(0);
        priceList.set(0,priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);
        System.out.println("priceList = " + priceList);








    }
}
