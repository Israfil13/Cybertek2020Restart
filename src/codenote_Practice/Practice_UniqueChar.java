package codenote_Practice;

public class Practice_UniqueChar {
    public static void main(String[] args) {
//        Interview question - 3 :
//        Write a return  method that can find the unique characters from the String
//        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
        String abz ="AAABBBCCCDEF";
                unique(abz);
    }

        public static void unique(String abz) {

            for (int i = 0; i < abz.length(); i++) {
                int count = 0;
                for (int j = 0; j <abz.length() ; j++) {
                    if (abz.charAt(i)==abz.charAt(j)) {
                        ++count;

                }



            }  if (count == 1) {
                    System.out.print(abz.charAt(i)+""+count);

                }
            }


        }}