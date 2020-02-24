package codenote_Practice;

public class StringMethods {
    public static void main(String[] args) {
//        Task 1:
//        Given a String with any possible length including 0
//        print first 2 characters only if the String has more than 1 character
//        if the String is empty print Empty String
//else print the first char twice in same Link
//        for example :
//        "abcde" --> ab
//        ""        --> empty String
//        "J"       --> JJ

 String str="p";
 if (str.length()>1){
     System.out.println(str.substring(0,2));
 }else if (str.isEmpty()){
     System.out.println("");
 }else if (str.length()==1) {
            System.out.println(str.charAt(0)+""+str.charAt(0));
        }


    }
}
