package day20;

public class ReversingAstring {
    public static void main(String[] args) {

        String name="Israfil";
        String reversedName="";
//        System.out.println(name.charAt(name.length()-1));
//        System.out.println(name.charAt(name.length()-2));
//        System.out.println(name.charAt(name.length()-3));
//        System.out.println(name.charAt(name.length()-4));
//        System.out.println(name.charAt(name.length()-5));
//        System.out.println(name.charAt(name.length()-6));
//        System.out.println(name.charAt(name.length()-7));

        for (int i = name.length()-1; i >=0; i--) {
            System.out.print(i+" ");
            System.out.println(name.charAt(i));
            reversedName=reversedName+name.charAt(i);
        }
        System.out.println(reversedName);


        }


    }

