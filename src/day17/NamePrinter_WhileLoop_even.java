package day17;

public class NamePrinter_WhileLoop_even
{
    public static void main(String[] args) {
        String name="Israfil Hajiyev";
        int x=0;
        while(x<=name.length()-1){

            if (x%2==0){
                System.out.print("index " + x +":");
                System.out.println(name.charAt(x));
            } ++x;
            }






        }





    }

