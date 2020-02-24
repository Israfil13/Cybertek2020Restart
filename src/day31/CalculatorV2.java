package day31;

public class CalculatorV2 {
    public static void main(String[] args) {

       calc(10,30,'-');
       calc(20,2,'+');
       calc(10,5,'*');
       calc(10,5,'/');
       calc(10,5,'s');


    }



    public static void calc(int num1,int num2,char operator){

        switch (operator){
            case'+':
                System.out.println("Substrack"+(num1-num2));
                break;
            case'-':
                System.out.println("Addiction"+(num1-num2));
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:{
                System.out.println("Invalid Operator");
            }


        }

    }








}
