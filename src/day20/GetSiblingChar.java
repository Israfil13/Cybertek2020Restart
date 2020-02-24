package day20;

public class GetSiblingChar {
    public static void main(String[] args) {
        String name="Arya";
        int charCharindex=name.length()-1;

        for (int x = 0; x <=charCharindex-1 ; x++) {
            System.out.println(name.substring(x,x+2));

//            for (int x = 0; x <=charCharindex-2 ; x++) {
//                System.out.println(name.substring(x,x+3));
//
//            }
        }
            String aaa="apple";

        for (int i = 0; i<=aaa.length()-2 ; i++) {
            System.out.println(aaa.substring(i,i+2));

        }

    }
}
