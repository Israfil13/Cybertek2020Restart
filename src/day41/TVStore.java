package day41;

public class TVStore {
    public static void main(String[] args) {

        TV t1=new TV();
        t1.brand="Sony";
//        t1.currentChannel=2000;
        System.out.println("t1 = " + t1);
        t1.turnOn();
        t1.turnOff();
        t1.setCurrentChannel(55);
        System.out.println(t1.getcurrentChannel());
        t1.turnOff();
        System.out.println("t1 = " + t1);


    }
}
