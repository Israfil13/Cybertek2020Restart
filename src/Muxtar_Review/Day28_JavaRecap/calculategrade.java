package Muxtar_Review.Day28_JavaRecap;

public class calculategrade {
    public static void main(String[] args) {
        calculategrade(20);
    }

    public  static  void calculategrade(int score){
        char Grade=(score>=90 && score<=100) ? 'A' : (score>=80 && score<=89) ? 'B' :
                (score>=79 && score<=70) ? 'C' : (score>=60 && score<=69) ? 'D' :
                        (score>=0 && score<=59) ? 'F' : 'I';

        if (Grade=='I'){
            System.out.println("Invalid Score");
        }else {
            System.out.println(Grade);
        }
    }
}
