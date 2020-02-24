package day43;

import day42.Movie;

public class MovieActions {
    public static void main(String[] args) {
        Movie m1=new Movie("Joker",2.5,"Drama");
        Movie m2=new Movie("FIght Club",2.1,"Action");
        printMovieIformation(m1);
        printShorterMovieDurationName(m1,m2);

        Movie result=getJokerMovie();
        System.out.println(result.getName());

    }

        public static Movie getJokerMovie( ){

        Movie j=new Movie("Joker",2.5,"drama");

        return j;


        }

    public static void printMovieIformation (Movie movieobj){
        System.out.println("The movie name "+movieobj.getName());
        System.out.println("is "+movieobj.getName()+" hour long");
        System.out.println("ans name is "+movieobj.getName());
    }
//
//**
//        * A void method that accept 2 movie objects
//     * and print the name of movie with shorter movie length
//     * for example Frozen is 1.5 hours , Joker is 2.2 hours
//     * so print The shorter movie is : Frozen
//     * @param movieObj1 first movie object
//     * @param movieObj2 second movie object
//     */
    public static void printShorterMovieDurationName(Movie movieObj1, Movie movieObj2) {
      if (movieObj1.getLenght()>movieObj2.getLenght()){
          System.out.println(movieObj1.getName());
      }else{
          System.out.println(movieObj2.getName());
      }

    }

}
