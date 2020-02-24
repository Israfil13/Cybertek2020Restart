package day31;

public class Greeting {
    public static void main(String[] args) {
        sayHello();
        sayHelloto(" Batch 15");
        sayHelloto(" Azerbaycan xalqina");
    }
    public static void sayHello(){
        System.out.println("Hello B15");
    }

    public static void sayHelloto(String name){
        System.out.println("Hello" + name);
    }

}
