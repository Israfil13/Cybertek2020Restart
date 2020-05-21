package Muxtar_Review.Day29_Return_Method_OVerloading;

public class Frequency_of_Char_InterviewQ {
    public static void main(String[] args) {
        String str="AAABBCCCCDDDD" ;

        System.out.println(frequancy(str));
    }

    public static String frequancy(String str){
        String nonDup="";
        String frequancy="";

        for (int i = 0; i <str.length(); i++) {
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }

        for (int i = 0; i <nonDup.length() ; i++) {
          int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (nonDup.charAt(i)==str.charAt(j)){
                    ++count;
                }
            }
            frequancy+=""+nonDup.charAt(i)+count;
        }
return frequancy;

    }







}
