package day09;

public class Test4LanguagePicker_SwitchStatement {
    public static void main(String[] args) {
        String greeting = "";
        int languageOption = 2;

        switch (languageOption) {
            case 1:
                System.out.println(greeting="Hello");
                break;
            case 2:
                System.out.println(greeting="Salam");
                break;
            case 3:
                System.out.println(greeting="Hola");
                break;
            case 4:
                System.out.println(greeting="Merhaba");
                break;
            case 5:
                System.out.println(greeting="Privet");
                break;
            default:
                System.out.println("Language is unknown");


        }


    }
}
