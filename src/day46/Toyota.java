package day46;

public class Toyota extends Car {
 @Override
  void start(){
    System.out.println("push button and start");
}

    public static void main(String[] args) {
        Toyota c1= new Toyota();
        c1.start();

        Jeep j1=new Jeep();
        j1.start();



}




}
