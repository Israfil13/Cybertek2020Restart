package aRepl_Practice;

import day01.Main;
import day22.Array;

import java.util.Arrays;

public class Num212_2DArray_Exchange {
    public static void main(String[] args) {
        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

        double res = convertC(test_money,test_convert);
        System.out.print(res);


}

    public static  double convertC(String[][] money,String[][] convertionRate) {
        double[] moneyy = new double[money.length];

        double currency = 0.0;
        double sum = 0;

        for (int i = 0; i < moneyy.length; i++) {
            moneyy[i] = Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);
            sum += moneyy[i];

        }
        return sum;
    }






        }





//       double mark = Double.parseDouble(money[0][1])*Double.parseDouble(convertionRate[0][1]);
//       double shekel = Double.parseDouble(money[1][1])*Double.parseDouble(convertionRate[1][1]);
//        return mark+shekel;




