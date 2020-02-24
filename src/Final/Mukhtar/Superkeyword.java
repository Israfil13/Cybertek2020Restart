package Final.Mukhtar;

class Testdata{
    int a=100;
    public  void method1(){
        System.out.println("super calss");
    }

    public Testdata(){

    }
    public Testdata(int num){
        System.out.println("A");
    }

}





public class Superkeyword extends Testdata {
    public static void main(String[] args) {
        Superkeyword s1= new Superkeyword(5);
        s1.mm();

    }
    public  void method1(){
        System.out.println("sub calss");

    }



    public  void mm(){
        System.out.println(super.a);
        super.method1();
        this.method1();
    }



    public Superkeyword(int num){

        System.out.println("B");
    }

}
