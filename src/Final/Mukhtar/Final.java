package Final.Mukhtar;
class  data{
    private String password="123";

public  void printName(){
    System.out.println("Hasan");
}

}
public class Final extends data {
   int a;
   final static double b=100;

    public  void printName(){
        System.out.println("Hasan");
    }


    public static void main(String[] args) {
        final  int num=300;
//        num=300;
        System.out.println(num);
    }
}
