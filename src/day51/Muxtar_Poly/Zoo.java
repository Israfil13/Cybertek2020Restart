package day51.Muxtar_Poly;

 class Animal {
     public  void talk(){
         System.out.println("Animal is talking");
     }
 }

 class Tiger extends  Animal{
     public void  Hunt(){
         System.out.println("Tiger is hunting ");
     }

     public  void talk(){
         System.out.println("Tiger is talking --roar");
     }

 }



class Octopus extends  Animal{
    public void  Swim(){
        System.out.println("Octopus is swiming ");
    }

    public  void talk(){
        System.out.println("Octopus is talking -- gologolo");
    }
}


public class Zoo {
    public static void main(String[] args) {
        Tiger t1=new Tiger();
        Octopus o1=new Octopus();

        Tiger [] tigers={t1,new Tiger()};
        Octopus[] octopus={o1,new Octopus()};

        Animal animal1=new Tiger();
        Animal animal2= new Octopus();
        animal1.talk();




    }
}
