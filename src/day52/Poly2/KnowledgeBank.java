package day52.Poly2;

public interface KnowledgeBank {
    void takNote();
    default void showTableContent(){
        System.out.print("A"+"B"+"C"
        );
    }
}
