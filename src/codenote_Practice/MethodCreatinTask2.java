package codenote_Practice;

public class MethodCreatinTask2 {
//    public static void main(String[] args) {
////        printLastCharacterOfName
////                * create a method that has 1 String parameter called name
////        and print last character of that name
//        lastchar("Israfil");
//
//    }
//
//    public static void lastchar (String name){
//        for (int i = 0; i <name.length() ; i++) {
//
//        }
//        System.out.println(name.charAt(name.length()-1));
//    }

//    printFullNameInformation
//* create a method that has 2 String parameter called firstName,lastName
//    and print "Your first name is firstName , Your last Name is lastName
//    print " your full name lenth is lengthOfTheFullName"

    public static void main(String[] args){
    fullname("Israfil","Hajiyev");

    }

    public static void fullname(String firstname,String lastname){
        System.out.println("Your fist name is :" + firstname);
        System.out.println("Your last name is :" + lastname);
        System.out.println("Yor full name lenght is :" + (firstname+lastname).length());
    }






}