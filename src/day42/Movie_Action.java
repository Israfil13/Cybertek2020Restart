package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie_Action {
    public static void main(String[] args) {

        Movie m1=new Movie();
        System.out.println("m1 = " + m1);

        Movie m2=new Movie("Joker",2.2,"Drama");
        Movie m3=new Movie("Frozen2",1.5,"Family");
        Movie m4=new Movie("FIght Club",2.1,"Action");
        Movie m5=new Movie("Axirinci Ashirim",1.4,"Drama");
        Movie m6=new Movie("Spider",1.9,"Drama");
        Movie m7=new Movie("Winter Sleep ",3.2,"Drama");
        Movie m8=new Movie("Old Boy",1.8,"Action");
        Movie m9=new Movie("A Separation",2.2,"Drama");
        Movie m10=new Movie("Memento",2.3,"Drama");

        ArrayList<Movie>myfav=new ArrayList<>(Arrays.asList(m2,m3,m4,m5,m6,m7,m8,m9,m10));

        for (Movie each:myfav){
            if (each.getLenght()<2){
                System.out.println("Movies less than 2 hours : "+each.getName());
            }
        }

        for (Movie each:myfav){
            if (each.getGenre().equalsIgnoreCase("action")){
                System.out.println("Action Movies : "+each.getName());
            }
        }

         for (Movie each : myfav){
             if (each.getLenght()>2){
               each.setGenre("long"+each.getGenre());
                 System.out.println("Long Movies : "+each);
             }
         }

         int max=0;
          for (Movie each:myfav){
              if (max<each.getName().length()){
                  max=each.getName().length();
              }
          }

          for (Movie each:myfav){
              if (max==each.getName().length()){
                  System.out.println("Longest name :"+each.getName());
              }
          }



//        System.out.println("m2 = " + m2);
//        System.out.println("m3 = " + m3);
//        System.out.println("m4 = " + m4);



        System.out.println(m2.getName().length());

    }
}
