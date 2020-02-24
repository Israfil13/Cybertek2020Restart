package day15;

public class SubStringPractise {
    public static void main(String[] args) {

        String movie = "Lord of the Rings";
        String wordof = movie.substring(5,8);
        System.out.println("word of = " + wordof);
        int startingpoint = movie.indexOf(" ")+1 ;
        int endingpoint = movie.length();
        System.out.println(movie.substring(startingpoint,endingpoint));

        String secondWordTillLast=movie.substring(5,17);
        System.out.println(secondWordTillLast);

        String wordlordof= movie.substring(0,7);
        System.out.println(wordlordof);

        String secondtoLast = movie.substring(5);
        System.out.println(secondtoLast);

        System.out.println(movie.substring(12,17) + movie.substring(4,7) + movie.substring(7,11)+ " " + movie.substring(0,4));



        // System.out.println("word the = " + movie.substring(8,11));





    }
}
