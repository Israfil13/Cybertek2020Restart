package day32;

public class StringAction {
    public static void main(String[] args) {
        reversname("Israfil");
        reversname("Ramil");
        reversname("Nigar");
    }

    public static void reversname(String name) {

        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
            if (i!=name.length()-1){
                System.out.print("-");
            }

//            if (i==name.length()-1){
//                System.out.print(name.charAt(i)   );
//            }else{
//                System.out.print(name.charAt(i)+"-");
//            }

        }    System.out.println();






    }
}