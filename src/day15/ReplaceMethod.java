package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        String message="I love Pumpkin, Pumpkin is FUN";
         message=message.replace("Pumpkin","Java");
        System.out.println(message);

        String message2="Happy Thanks Giving to all!!";
        System.out.println(message2.replace("Thanks Giving", "Thanksgiving"));
        System.out.println(message2.replace("!!","!"));
        System.out.println(message2.replace(" ",""));


        String message3="Tomorrow is of no!!";
        System.out.println(message3.replace("no"," "));

        String s="";
        System.out.println(s.isEmpty());

    }
}
