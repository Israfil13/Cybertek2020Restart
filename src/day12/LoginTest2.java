package day12;

public class LoginTest2 {
    public static void main(String[] args) {
        String name="Israfil";

        boolean nameCorrect = name.equals("israfil");

        System.out.println(nameCorrect);

        boolean nameCorrect2=name.equalsIgnoreCase("IsRaFiL");

        System.out.println(nameCorrect2);

    }
}
