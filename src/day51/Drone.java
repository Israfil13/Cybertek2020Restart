package day51;

public class Drone implements UprightFlyable{
    @Override
    public void flyupright() {
        System.out.println("Flying unpright");
    }

    @Override
    public void fly() {
        System.out.println("Flying regularly");
    }
}
