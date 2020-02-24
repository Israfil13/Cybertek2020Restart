package day42;
//    Add Setters to Movie Class
//    Create List<Movie> yourFavoriteMovieLst  add 10 Movie Objects
//    Print the name of the movies less than 2 hours
//    Print all the Action movies
//    If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)
//     for example : if type was Action -->> LongAction , Drama--> LongDrama
//    Find out longest Movie name
public class Movie {
   private String name;
    private  double lenght;
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

  public Movie(){

  }


    public Movie(String name, double lenght, String genre) {
        this.name = name;
        this.lenght = lenght;
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", lenght=" + lenght +
                ", genre='" + genre + '\'' +
                '}';
    }
}
