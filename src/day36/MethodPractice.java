package day36;

public class MethodPractice {
    public static void main(String[] args) {
//        write a static method to accept a String and return Boolean(Yes Uppercase) .
//                it should return true if the String contains at least one number.

      Boolean result1=  checkifhasanumber("ya12im4");
        System.out.println(result1);
   }

    public static Boolean checkifhasanumber (String str){
        for (int i = 0; i <str.length() ; i++) {
            char eachchar=str.charAt(i);
            if (Character.isDigit(eachchar)){
                return Boolean.valueOf(true);
            }


        }
        return Boolean.valueOf(false);
    }


}
