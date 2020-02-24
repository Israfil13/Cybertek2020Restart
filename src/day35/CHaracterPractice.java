package day35;

public class CHaracterPractice {
    public static void main(String[] args) {
String str="A34B123C4X";
//String[]arrstr=a.toCharArray(str)
String numsInt="";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));

            if (Character.isDigit(str.charAt(i))){
                numsInt+=str.charAt(i);
            }

        }
        Integer num=Integer.valueOf(numsInt);
        System.out.println("num = " + num);
    }








}
