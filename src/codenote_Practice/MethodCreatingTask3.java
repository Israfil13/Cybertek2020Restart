package codenote_Practice;

public class MethodCreatingTask3 {
//    public static void main(String[] args) {
//    compareNameCharacterCount
//* create a method that has 2 String parameter called name1,name2
//	if name 1 has more characters
//    print " name 1 is longer "
//            if name 2 has more characters
//    print " name 2 is longer "
//            if name 2 has same character count
//    print " name 1 and name 2 same character count "

//        charcompare("Sohrab","Lala");
//    }
//
//    public static void charcompare(String name1,String name2){
//        if (name1.length()>name2.length()){
//            System.out.println(" name 1 is longer ");
//        }else if (name1.length()<name2.length()){
//            System.out.println("name 2 is longer");
//        }else{
//            System.out.println("name 1 and name 2 same char count");
//        }
//    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args){
//        printAtoZ
//                * create a method that has no parameter
//        and print A-Z in one line
            az();
        System.out.println();
            za();
    }

        public static void az(){


            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i+" ");
            }
    }


    public static void za(){

        char a;

        for (a= 'Z'; a >= 'A'; a--) {
            System.out.print(a+" ");
        }
    }






}
