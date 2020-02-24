package day10;
import java.util.Scanner;
public class AtHomeSwitch {
    public static void main(String[] args) {

        System.out.println(" Welcome to Nigisra Shopping");
        Scanner scan = new Scanner(System.in);
        System.out.println("what kind of t shirt you want? ;");
        String shirtDesign = scan.nextLine();
        String order = "";
        System.out.println("Choose your size :");
        String shirtSize = scan.nextLine();
        String size = "";
        ;

        switch (shirtDesign) {
            case "Led Zeppelin":
                System.out.println("Your design is Led Zeppelin");
                order = "Led Zeppelin";
                break;
            case "Nirvana":
                System.out.println("Your design is  Niravana");
                order = "Nirvana";
                break;
            case "Metallica":
                System.out.println("Your design is  Metallica");
                order = "Metallica";
                break;
            case "Aerosmith":
                ;
                System.out.println("Your design is Aerosmith");
                order = "Aerosmith";
                break;
            default:
                System.out.println("Sorry we does not have that design");
                order = "unkown";
        }

        switch (shirtSize){
            case "XL":
                System.out.println("Your size is XL");
                size="XL";
                break;
            case "L":
                System.out.println("Your size is L");
                size="L";
                break;
            case "M":
                System.out.println("Your size is M");
                size="M";
                break;
            case "S":
                System.out.println("Your size is S");
                size="S";
                break;
            default:
                size="unknown";
                System.out.println("Sorry your size is invalid");

        }

        System.out.println("Your order is "+shirtSize + " size " +shirtDesign+"\n Mubarekdi, sagliqnan geyin");



    }

}



