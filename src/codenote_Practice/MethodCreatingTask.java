package codenote_Practice;

public class MethodCreatingTask {
//    public static void main(String[] args) {
//        reverseName();
//        //    reversePrintMyOwnName
////* create a method that has no parameter
////    and print your name in reversed order
//    }

    //    public static void reverseName(){
//        String myname="Israfil";
//        for (int i = myname.length()-1; i >=0 ; i--) {
//            System.out.print(myname.charAt(i));
//        }
//
//    }
//*******************************************************************************************************
//            reversePrintAnyName
//* create a method that has 1 String parameter called name
//    and print that name in reversed order
    public static void main(String[] args) {
    reversedName("Israfil");

    }

    public static void reversedName(String myname){
        for (int i = myname.length()-1; i >=0 ; i--) {
            System.out.print(myname.charAt(i));
        }
    }















}
//            printLastCharacterOfName
//* create a method that has 1 String parameter called name
//    and print last character of that name
//            printFullNameInformation
//* create a method that has 2 String parameter called firstName,lastName
//    and print "Your first name is firstName , Your last Name is lastName
//    print " your full name lenth is lengthOfTheFullName"
//    compareNameCharacterCount
//* create a method that has 2 String parameter called name1,name2
//	if name 1 has more characters
//    print " name 1 is longer "
//            if name 2 has more characters
//    print " name 2 is longer "
//            if name 2 has same character count
//    print " name 1 and name 2 same character count "
//    printAtoZ
//* create a method that has no parameter
//    and print A-Z in one line
//    printZtoA
//* create a method that has no parameter
//    and print Z-A in one line
//    printAlphabetInRange
//* create a method that have 2 char as parameters: beginning, ending
//if beginning character is before ending character
//	for example beginning A , ending D  -->> ABCD
//if beginning character is after ending character
//	for example beginning D , ending A  -->> DCBA