package aRepl_Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NUm88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for (int i = 0; i <= word.length() - 3; i++) {
            String currentchar = (word.substring(i, i + 3));
            if (currentchar.equalsIgnoreCase("cat")&&currentchar.equalsIgnoreCase("dog")) {
                     countOfCats++;
                  countOfDogs++;
                  if (countOfCats==countOfDogs){
                      System.out.println("true");
                  }
              }

            }


        }
    }
