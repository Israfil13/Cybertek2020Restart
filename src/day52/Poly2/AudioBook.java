package day52.Poly2;

public class AudioBook extends Book {
   double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration=duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("The name of audioBook is " + name + " and " + "the author is " + author +
                ", the duration is " + duration + " min.");
    }

    @Override
    public void takNote() {
        System.out.println("Taking note double clicking on screen");
    }

   public void listen (){
       System.out.println("I am listening the my "+name+" book");
   }
}
