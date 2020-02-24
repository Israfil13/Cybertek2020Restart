package day49;

import com.sun.security.jgss.GSSUtil;

public class Tesla extends Vehicle implements Autonomous,Chargable {
    int horsePower;
    String model;

    @Override
    public void update() {
        System.out.println("Tesla updates it's software");
    }

    public Tesla(String brand, int horsePower, String model){
        super(brand);
        this.horsePower=horsePower;
        this.model=model;
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self driving car");
    }

    @Override
    public void start() {
        System.out.println("Tesla starting by computer");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Tesla t1=new Tesla("Tesla",360,"Model X");
        t1.selfDrive();
        t1.start();
        System.out.println(t1);
        t1.charge();

    }

    @Override
    public void charge() {
        System.out.println("Tesla charges");
    }
}
