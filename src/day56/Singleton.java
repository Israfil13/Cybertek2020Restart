package day56;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("no args");
    }

    public static Singleton getIntance() {
        if (instance==null) {
            instance= new Singleton();
        }else {
      }
        return instance;
    }




}