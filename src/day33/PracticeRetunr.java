package day33;

public class PracticeRetunr {
    public static void main(String[] args) {
        System.out.println(getSUmFrom1toX(5));
        System.out.println(gotemail("Israfil","Hajiyev"));
    }
    public static int getSUmFrom1toX(int num){
        int sum=0;
        for (int i = 0; i <=num ; i++) {
            sum+=i;

        }
        return sum;
    }

    public static String gotemail(String firstname,String lastname){
        String email=firstname.charAt(0)+lastname+"@nightwatch.com";

        return email;

    }





}
