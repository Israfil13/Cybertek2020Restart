package aRepl_Practice;

public class Num_181_Method_String_word_count {
    public static void main(String[] args) {
        System.out.println(wordCount("one two three"));
    }
    public static int wordCount(String words) {
        String [] arr=words.split(" ");
        int count=0;
        for (String each:arr){
            ++count;
        }
        return count;



    }
}
