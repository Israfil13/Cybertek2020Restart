package day17;


public class Loop {
    public static void main(String[] args) {
        int cnt=1;
        while (cnt<=5){
            System.out.print(cnt + " ");
        ++cnt;}
        System.out.println("counter " + cnt);
        while(cnt>=1){
           --cnt;
            System.out.print(cnt+" ");

        }
        System.out.println("counter " + cnt);
    }
}
