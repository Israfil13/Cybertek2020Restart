package day51.Muxtar_Poly;

abstract class AbstractClass_{
public static void ByLinkText(){
    System.out.println("Link Text super");
}

}




public   class Test  extends AbstractClass_{
    public static void ByLinkText(){
        System.out.println("Link Text sub");
    }
   public static void Test(){

   }

    public static void main(String[] args) {
        AbstractClass_ a1=new Test();
         a1.ByLinkText();














    }
}
