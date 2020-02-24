package day21;

public class searchingSomethinginString {
    public static void main(String[] args) {
        String name="Israfil Hajiyev";
        for (int i = 0; i <=name.length()-3 ; i++) {
       String currentChar=name.substring(i,i+3);
        if (currentChar.equalsIgnoreCase("raf")){
            System.out.println("The index of a or A is " + i);
            }
        }
            int counter = 0;
            String nam="Lala Hajili";
        for (int i = 0; i<=nam.length()-2; i++) {
           String currentchar=nam.substring(i,i+2);
            if (currentchar.equalsIgnoreCase("la")){
                System.out.println("i found "+currentchar);
                System.out.println("index of la is " +i);
             ++counter ;
                System.out.println(counter);
            }

            }




    }}

