package day21;

public class CountSomethinginString {
    public static void main(String[] args) {
        String name="Israfil Hajiyev";
        int counter=0;
        for (int i = 0; i <=name.length()-2 ; i++) {
            String currentChar=name.substring(i,i+2);

            if (currentChar.equalsIgnoreCase("a")){

                counter++;

            }

        }System.out.println(counter);




    }

}
