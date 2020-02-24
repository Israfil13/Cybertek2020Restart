package aRepl_Practice;

public class Num_180_Method_String_Cover {
    public static void main(String[] args) {

        System.out.println(coverString("java methods", "ze") ) ; //java [me]thods

    }

    public static String coverString(String main, String coverME) {
        if (main.contains(coverME)){
            return main.replace(coverME,"["+coverME+"]");
    }else {
            return "["+main+"]";
        }

    }
}
