package day58;

public class ExceptionPractice {
    public static void main(String[] args)throws Exception {
        System.out.println("System 1");
        Thread.sleep(5000);
        System.out.println("System 3");
        System.out.println("System 4");
        Thread.sleep(5000);
        System.out.println("System 5");
    }

    public static void  method1()throws Exception{
        main(new String[]{"A"});
    }

    public static void method2(){
        try{
            method1();
        }catch (Exception e){

        }
    }

    public static void method3(){
        method2();
//        method1();
    }




}
