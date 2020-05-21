package Muxtar_Review.Day28_JavaRecap;

public class Calculator {
    public static void main(String[] args) {
        calc(5,2,'8');
    }


    public static void calc(int num1,int num2,char operator){
        int result=0;
        if (operator=='+'){
            result=num1+num2;
        }else if (operator=='-'){
            result=num1-num2;
        }else if (operator=='*'){
            result=num1*num2;
        }else if (operator=='/'){
            result=num1/num2;
        }else if (operator=='%'){
            result=num1%num2;
        }
        else {
            System.out.println("invalid operator");
        }

//        int result2= (operator=='-') ? (num1-num2) : (operator=='+') ? (num1+num2) : (operator=='*') ? (num1*num2)
//                : (operator=='/') ? (num1/num2) : (operator=='%') ? (num1%num2) :

        System.out.println(result);

    }
}
