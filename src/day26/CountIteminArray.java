package day26;

import java.util.Arrays;

public class CountIteminArray {
    public static void main(String[] args) {
        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America", "Spiderman",
                "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));
        int sizeofArray=marvelHeros.length;
        System.out.println("sizeofArray = " + sizeofArray);
        int countofblack=0;
        for (String itemToSearch:marvelHeros){

        int countOfItem = 0;
        for (String eachHero:marvelHeros) {
            if (eachHero.equalsIgnoreCase(itemToSearch)) {
                countOfItem++;
                }
            }


            System.out.println("countOfItem = " + countOfItem);
        }  for (String eachHero:marvelHeros){
            if (eachHero.toLowerCase().contains("black")){
                countofblack++;
            }

        }

        System.out.println("countofblack = " + countofblack);

    }
}
