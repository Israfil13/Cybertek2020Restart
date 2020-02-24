package codenote_Practice;

public class PracticeFrequency {
    public static void main(String[] args) {
//        Write a return method that can find the frequency of characters
//        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
            String aaa="AAABBCDD";

        for (int i = 0; i <aaa.length() ; i++) {
            int count=0;
            String result="";
            for (int j = 0; j <aaa.length() ; j++) {
                if (aaa.charAt(i)==aaa.charAt(j)){
                    ++count;
                }
                if (!result.equals(aaa.substring(i,i+1))){
                    result=result+aaa.charAt(i)+""+count;
                }
            } System.out.print(result);

        }




    }
}
