package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );
            
        String   itemdetail="iPhone 6s,449,18.71";
        System.out.println("itemdetail = " + itemdetail.split(",")[0]);
        for (int i = 0; i <productLst.size() ; i++) {
            String [] splited=productLst.get(i).split(",");

            System.out.println("item name = "+splited[0]);
            System.out.println("item price = "+splited[1]);
        }

//       double price=0;
        for (String eachProduct:productLst){
          double price=Double.parseDouble(eachProduct.split(",")[1]);


            if (price>500){
                System.out.println(price);
            }

        }

        double sum=0;
        double average=0;
        for (String eachProduct:productLst){
            double price=Double.parseDouble(eachProduct.split(",")[1]);
            sum+=price;

        }
            average=sum/productLst.size();
        System.out.println("average = " + average);



        for (String eachProduct:productLst) {
           String name=eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthly<20){
                System.out.println(name+" "+monthly);
            }

        }

        for (String eachProduct:productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (name.contains("iPhone")) {
                System.out.println(name +" "+ monthly);
            }
        }

//        double maxPrice=Double.parseDouble(productLst.get(0).split(",")[1]);
       String expensiveitem="";
        double maxPRice=0;

        for (int i = 0; i <productLst.size() ; i++) {
           double price=Double.parseDouble(productLst.get(i).split(",")[1]);
            if (maxPRice<Double.parseDouble(productLst.get(i).split(",")[1])){
                maxPRice=price;
                expensiveitem=productLst.get(i).split(",")[0];
            }
        }
        System.out.println("expensiveitem = " + expensiveitem+" "+maxPRice);

        String dysonnew="";
        for (String each:productLst){
            if (each.contains("Dyson")){
                int dysonindex=productLst.indexOf(each);
                String name=each.split(",")[0];
                double price=Double.parseDouble(each.split(",")[1]);
                double monthly=Double.parseDouble(each.split(",")[2]);
                dysonnew=name+","+price*0.2+","+monthly*0.2;
                productLst.set(dysonindex,dysonnew);
            }
        }

        System.out.println("dysonnew = " + dysonnew);
//        System.out.println("productlist = " + productLst);



            int count=0;
            for (String eachproduct:productLst){
                double price=Double.parseDouble(eachproduct.split(",")[1]);
                if (price>average){
                    ++count;
                }

            }
        System.out.println("count = " + count);


        for (int i = 0; i <productLst.size() ; i++) {
            double price=Double.parseDouble(productLst.get(i).split(",")[1]);
            if(price>average){
                productLst.remove(i);
                --i;
            }
        }

        System.out.println(productLst.size());


        ArrayList<String>itemnames=new ArrayList<>();
        ArrayList<Double>prices=new ArrayList<>();
        ArrayList<Double>monthly=new ArrayList<>();

        for (String each:productLst){
            String name=each.split(",")[0];
            itemnames.add(name);
            double itemprices=Double.parseDouble(each.split(",")[1]);
            prices.add(itemprices);
            double monthlypay=Double.parseDouble(each.split(",")[2]);
            monthly.add(monthlypay);
        }

        System.out.println("itemnames = " + itemnames);
        System.out.println("prices = " + prices);
        System.out.println("prices = " + monthly);









        }

}
