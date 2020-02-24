package day13;

public class TestStringStartWithorEndWith {
    public static void main(String[] args) {

        String name = "Nigar";

        System.out.println(name.startsWith("Ni"));
        System.out.println(name.endsWith("ar"));
        name=name.toUpperCase();
        System.out.println(name.endsWith("R"));
    }
}
