package day19;

public class FindingTheCOuntingofSomething {
    public static void main(String[] args) {
       int counter=0;
        for (int i = 1; i <=100 ; i++) {
           if (i%15==00){
             System.out.println(i);
            ++counter;
           }
        }
        System.out.println("counter = " + counter);

        String name="Israfil Hajiyev";
        int countofA=0;

        for (int x =0 ; x <=name.length()-1 ; x++) {
            System.out.println(name.charAt(x));
            if(name.charAt(x)=='a'){
                System.out.println("Bingo");
                ++countofA;
            }
        }
        System.out.println("countofA = "+countofA);


    }
}
