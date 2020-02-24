package day44.day44sub;

public class Car2 extends Car  {
    int engine;

    @Override
    public String toString() {
        return "Car2{" +
                "engine=" + engine +
                ", mileage=" + mileage +
                ", make='" + make + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Car2 c2=new Car2();
        c2.make="BMQ";
        c2.engine=3;
        c2.setYear(2005);
        c2.mileage=1212;
        System.out.println("c2 = " + c2);



    }

}

