package day17;

public class NamePrinter_Whileloop {
    public static void main(String[] args) {

        String name="Israfil Hajiyev";

       int x=0;
          System.out.println(name.charAt(x));
       while(x<name.length()){
            System.out.print("index "+ x +" : ");
            System.out.println(name.charAt(x));
            ++x;
        }

//        int x=name.length()-1;
//        while (x>=0){
//            System.out.print(" index " + x + " : ");
//            System.out.println(name.charAt(x));
//            --x;
//        }
//


        String name2="Nigar Hajiyev";
       int xx=0;
       while (xx<=name2.length()-1){
           System.out.print("index "+ xx +" : ");
           System.out.println(name2.charAt(xx));
           ++xx;
       }







    }
}
