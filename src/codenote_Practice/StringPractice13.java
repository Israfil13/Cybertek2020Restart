package codenote_Practice;

public class StringPractice13 {
    public static void main(String[] args) {
//        Task 13:
//        Given a String with 3 characters
//        swamp first character with last character
//        and check whether new String is same as old one
//        if so print Palindrome

        String word="sos";
        String word2=new String (word.charAt(2)+word.substring(1,2)+word.charAt(0));
       if (word.equals(word2)){
           System.out.println("polindrom");
       }

    }
}
