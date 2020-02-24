package day49;

public class IceCream  implements Edible{
    @Override
    public void eat() {
        System.out.println("eat with spoon");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted");
    }

    @Override
    public void digest() {
        System.out.println("kop vermesin ha");
    }

    public static void main(String[] args) {
        IceCream i1=new IceCream();
        i1.drink();
        System.out.println(i1.toString());
        Object i2= new IceCream();
        i1.digest();
Juicy.squeeze();




    }




}
