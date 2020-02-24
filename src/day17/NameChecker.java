package day17;

import java.sql.SQLOutput;

public class NameChecker {
    public static void main(String[] args) {
        String name= "IsRafIL HaJiyEv";

        String name2=name.toLowerCase().replace("s","S");
        System.out.println(name2);
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase());

        String nameFixed=(name.charAt(0)+"").toUpperCase();
                nameFixed=nameFixed+name.substring(1).toLowerCase();
        System.out.println(nameFixed);

//        name=name.toLowerCase();
//        System.out.println(name.);


        String fullName="arYa sTark";

        String firstName=fullName.substring(0,fullName.indexOf(" "));
        String lastName=fullName.substring(fullName.indexOf(" ")+1);
        System.out.println(firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1)+" "+
                lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1));


        String fullname1="SOhrAB haJIlI";

        String firstname1=fullname1.substring(0,fullname1.indexOf(" "));
        String lastname1=fullname1.substring(fullname1.indexOf(" ")+1);
        System.out.println(firstname1.toUpperCase().substring(0,1)+firstname1.toLowerCase().substring(1) + " "+
                lastname1.toUpperCase().substring(0,1)+lastname1.toLowerCase().substring(1));


    }


}
