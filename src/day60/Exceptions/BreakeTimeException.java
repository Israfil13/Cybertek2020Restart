package day60.Exceptions;

public class BreakeTimeException extends RuntimeException {


}

class Main{
    public static void main(String[] args) {

//        throw new BreakeTimeException();

        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("My own checked exception");
        }


    }
}