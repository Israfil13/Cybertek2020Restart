package day12;

public class CarSHopping {
    public static void main(String[] args) {
        String carBand ="Corolla" ;
        int carPrice = 50000;
        int budget = 40000 ;


        if (carBand.equals("Corolla")  ||  carBand.equals("Tesla") && carPrice<=budget) {
            System.out.println("Car Aquired");
        }else{
            System.out.println("Not what i am looking for");
        }

//        if (carBand.equals("Corolla") ){
//            System.out.println("Carolla Aquired");  }
//    else if (carBand.equals("Tesla") && carPrice<=budget ){
//            System.out.println("Tesla Aquired");
//        }else{
//            System.out.println("Not what i am looking for");
//        }




    }
}
