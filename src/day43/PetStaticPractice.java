package day43;

public class PetStaticPractice {
    public static void main(String[] args) {


//        String str = String.valueOf(10);

        Pet.showGeneralPetinfo();

        Pet p1=new Pet("Cat","yumyum");
        System.out.println("p1 = " + p1);
        p1.speak();




    }
}
