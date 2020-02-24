package codenote_Practice;

public class MethodCreatingTask4 {
    public static void main(String[] args) {
//        printAlphabetInRange
//                * create a method that have 2 char as parameters: beginning, ending
//        if beginning character is before ending character
//        for example beginning A , ending D  -->> ABCD
//        if beginning character is after ending character
//        for example beginning D , ending A  -->> DCBA
  printAlphabetInRange('D','A');
  printAlphabetInRange('A','D');

    }

    public static void  printAlphabetInRange (char beginning,char ending) {
        if (beginning < ending) {
            for (char i = beginning; i <= ending; i++) {
                System.out.println(i);
            }
        } else if (beginning > ending) {
            for (char i = beginning; i >= ending; i--) {
                System.out.println(i);
            }
        }


    }}
