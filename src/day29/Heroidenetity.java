package day29;

public class Heroidenetity {
    public static void main(String[] args) {
        String hero="Superman-Clark J Kent";
        String splithero[]=hero.split("-");
        String fullname=splithero[1];

        int lenghoffullname=splithero[1].length();
        String stars="";
        for (int i = 0; i <lenghoffullname ; i++) {
            stars=stars+"*";
        }

        System.out.println(splithero[0]+" "+ fullname.replace(fullname,stars));

        System.out.println(splithero[0] + " "+stars);





    }
}
