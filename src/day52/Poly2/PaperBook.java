package day52.Poly2;

public class PaperBook extends Book implements Readable{
    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    public void displayBookInfo(){
        System.out.println("Book's name is: "+name+", and the author is: "+author
                +" and it weight "+weight+"pound"
        );
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takNote() {
        System.out.println("Taking note from "+name);
    }


    @Override
    public void read() {
       System.out.println("Reading the "+name+" written by "+author);
    }
}
