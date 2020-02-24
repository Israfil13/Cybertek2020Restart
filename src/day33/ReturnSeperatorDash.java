package day33;

public class ReturnSeperatorDash {
    public static void main(String[] args) {
        System.out.println(getSpellednmae("Israfil"));
        System.out.println(getSpellednmae2("Ramil"));

    }

    public static String  getSpellednmae(String name) {
            String result="";
        for (int i = 0; i < name.length(); i++) {
            result=result+name.charAt(i);
            if (i!=name.length()-1){
                result=result+"-";
            }


    }
    return result;

    }


    public static String  getSpellednmae2(String name) {
        String result = "";
        for (int i = 0; i <name.length()-1 ; i++) {
            result += name.charAt(i) + "-";

        }

        return result+name.charAt(name.length()-1);















    }
}