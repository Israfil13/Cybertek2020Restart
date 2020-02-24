package day47;

public class ElectricCar extends Car {

    int batteryLevel;

    public static void main(String[] args) {

//        Car c1 = new Car();
        ElectricCar e1 = new ElectricCar();
        e1.start();


    }

    @Override
    public void start() {
        System.out.println("This is how electric car start ");
    }


    public void goForward(){
        System.out.println("Car moved gorward");
    }

    public void goBackward(){
        System.out.println("going back");
    }

    public void turn(String direction){
        System.out.println("turning "+direction );
    }


}
