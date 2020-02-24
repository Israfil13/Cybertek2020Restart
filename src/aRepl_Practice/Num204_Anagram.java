package aRepl_Practice;

public class Num204_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Silent","Listen"));
    }

    public static boolean isAnagram(String word1, String word2) {
        word1=word1.replace(" ","").toLowerCase();
        word2=word2.replace(" ","").toLowerCase();

        int count=0;

        for (int i = 0; i <word1.length() ; i++) {
            for (int j = 0; j <word2.length() ; j++) {
                if (word1.charAt(i)==word2.charAt(j)){
                ++count;
            }
            }


        }

        if (count==word1.length()){
            return true;
        }else {
            return false;
        }

    }
}
