package day31;

public class MethodPractice2 {
    public static void main(String[] args) {

   count1to10();
   count1to10();
countdownfrom20();
oddnumbers100();
spellName();

    }
    public static void count1to10(){
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void countdownfrom20(){
        for (int i = 20; i >1 ; i--) {
            System.out.println(i+" ");
        }}

        public static void oddnumbers100(){
            for (int i = 0; i <100 ; i++) {
                if (i%2!=0)
                System.out.println(i+" ");
            }}

        public static void spellName(){
        String name="Israfil";
            for (int i = 0; i <name.length() ; i++) {
                if (i == name.length() - 1) {
                    System.out.print(name.charAt(i));
                } else {
                    System.out.print(name.charAt(i) + "-");
                }

            }}}














