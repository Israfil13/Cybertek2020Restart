package Practice;

public class ReverseString {
    public static void main(String[] args) {
//        String str="Hi.My name is Hasan";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            System.out.print(str.charAt(i));
//        }
        System.out.print("hello");
        System.out.print("hello");
        String ad="adfaf";
        System.out.println(ad.charAt(0)+ad.charAt(ad.length()-1));
        System.out.println(lastTwo("catrama"));
    }
    public static String lastTwo(String str) {
        if(str.length()>2){
            return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
        }else{
            return ""+str.charAt(0)+str.charAt(1);
        }


    }
}
