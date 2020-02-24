package Final;

class A{
    public void methodA(){
        System.out.println("method A");
    }

}

class B extends A{
public void methodB(){
    System.out.println("method B");
}
}


public class Polymorphism {
    public static void main(String[] args) {
        A obj=new A();
        A obj2=new B();
        obj2.methodA();
        obj.methodA();





    }


}
