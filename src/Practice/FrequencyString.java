package Practice;

public class FrequencyString {
    public static void main(String[] args) {
      String str="AAABBCDD";
      String nonDup="";

        for (int i = 0; i <str.length() ; i++) {
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+=""+str.charAt(i);
            }
        }


        for (int i = 0; i <nonDup.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (nonDup.charAt(i)==str.charAt(j)){
                    ++count;
                }
            }
            System.out.println(""+nonDup.charAt(i)+count);
        }






    }
}
