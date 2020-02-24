package day31;

public class practice {
    public static void main(String[] args) {

        for (int i = 0; i <2 ; i++) {
            practice.sayHello7times();
            System.out.println("-----");
        }
//////////////////////////////////////////////////////////////////////////
        MethodINtro.sayHello();

////////////////////////////////////////////////////////////////////////////
        System.out.println("------");

        math();

        }

///////////////////////////////////////////////////////////////////////////

    public static void sayHello7times() {

        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.println("Hello world line 4 ");
        System.out.println("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");



    }
//////////////////////////////////////////////////////////////////////
 public static void math(){

     int num1 = 5;
     double num2 = 3.0d;
     float num3 = 3.0f;
     double result1 = num1 + num2;
     double result2 = num1 - num2;
     double result3 = num1 * num2;
     double result4 = num1 / num2;
     float result5 = num1 / num3;
     System.out.println(result1);
     System.out.println(result2);
     System.out.println(result3);
     System.out.println(result4);
     System.out.println(result5);



 }
///////////////////////////////////////////////////






    }

