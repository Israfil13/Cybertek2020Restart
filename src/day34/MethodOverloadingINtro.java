package day34;

public class MethodOverloadingINtro {
    public static void main(String[] args) {
        String name="overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));
        sayHello();
        sayHello("Universe");
        sayHello(5);
        System.out.println("Hello "+sayHello("Israfil","Hajiyev"));
    }
    public static void sayHello(){
        System.out.println("Helo,World");
    }
    public static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    public static void sayHello(int num){
        System.out.println("Hello "+num);
    }
    public static String sayHello(String name,String surname){
    return name+" "+surname;
    }

}
