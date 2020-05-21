package Muxtar_Review.Day27_Methods;

public class Remove_Duplicates {
    public static void main(String[] args) {
        System.out.println(nondup("aaabbbbccccddffff"));
    }

    public static String nondup(String str){
        String nondup="";

        for (int i = 0; i < str.length(); i++) {
            if (!nondup.contains(""+str.charAt(i))){
                nondup+=str.charAt(i);
            }
        }
        return nondup;
    }
}
