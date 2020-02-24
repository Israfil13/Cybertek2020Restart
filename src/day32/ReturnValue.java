package day32;

public class ReturnValue {
    public static void main(String[] args) {
        String name=givememMtname();
        System.out.println("name= "+name);

        int myresult=doublethenumber(10 );
        System.out.println("myresult = " + myresult);
        System.out.println("result of doubing is "+doublethenumber(100));

        int sum=add2Number(14,16);
        System.out.println("sum = " + sum);

        System.out.println(add2Number(14,16));

    }

    public static int add2Number(int num1,int num2){

        return num1+num2;


    }







    public  static String givememMtname(    ){
        return "Israfil";
    }

    public static int doublethenumber(int num){
        System.out.println("I amm going to double the valud of " + num);
        int result=num*2;
        return result;

    }



}
