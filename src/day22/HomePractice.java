package day22;

public class HomePractice {
    public static void main(String[] args) {
        int[]num=new int[3];
        num[0]=5;
        num[1]=15;
        num[2]=18;

        int max=num[0];
        for (int i = 0; i <3 ; i++) {
            if (num[i]>max){
                System.out.println("max"+num[i]);
            }

        }



    }
}
