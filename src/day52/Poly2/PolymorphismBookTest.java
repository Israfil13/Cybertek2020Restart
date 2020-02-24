package day52.Poly2;

import java.util.Arrays;
import java.util.List;

public class PolymorphismBookTest {
    public static void main(String[] args) {

        Book b2 = new PaperBook("Selenium","Vasyl",2);
        Book b3 = new AudioBook("Agile","Guljannat",1.8);
        Book b4 = new PaperBook("The Kite Runner","Khaled Hosseini",3);
        Book b5 = new PaperBook("Lord of the Rings","J. R. R. Tolkien",2000);
        Book b6 = new AudioBook("Game of Thrones","George R. R. Martin",95.5);
        b2.displayBookInfo();
        KnowledgeBank kb=b2;
        kb.takNote();
        kb.showTableContent();
/////////////////////////////////////////////////////////////////////////////////
        b3.displayBookInfo();
        b3.showTableContent();

        List<Book>bookList= Arrays.asList(b2,b3,b4,b5,b6);
       int count=0;
        for (Book each:bookList){
           // each.displayBookInfo();
            System.out.println(each.getClass().getSimpleName());
            if (each.getClass().getSimpleName().equals("PaperBook")){
                ++count;
            }

        }

        System.out.println("count = " + count);



    }
    }

