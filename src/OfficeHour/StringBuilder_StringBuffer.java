package OfficeHour;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {

        String str1="Java";
        System.out.println("str1 = " + str1);
        String str2=str1;
        System.out.println("str2 = " + str2);
        str1="selenium";
        System.out.println("str1 after change = " + str1);
        System.out.println("str2 = " + str2);

        StringBuilder sb1= new StringBuilder("html");
        StringBuilder sb2=sb1;
        System.out.println("sb2 = " + sb2);
        System.out.println("sb1 = " + sb1);
        sb1=new StringBuilder("cucumber");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);

        StringBuilder sb3= new StringBuilder("jenkins");
        StringBuilder sb4=sb3;
        System.out.println("sb3 = " + sb3);
        System.out.println("sb4 = " + sb4);
        sb3.reverse();
        System.out.println("sb4 = " + sb4);
        System.out.println("sb3 = " + sb3);


    }
}
