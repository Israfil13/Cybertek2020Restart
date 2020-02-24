package day25;

public class OfficeHour {
    public static void main(String[] args) {

        int[]  grades ={1,2,3,4,4,5,6,7,8};

        int max=0;
        for (int i = 0; i <grades.length ; i++) {
            if (max < grades[i]){
                max=grades[i];
            }}
        System.out.println(max);
        int max2=0;
        for (int i = 0; i <grades.length ; i++) {
            if (max2 < grades[i] && grades[i]<max){
                max2=grades[i];
            }
        }System.out.println(max2);



        int a=10,b=30;
        int c=a;
        a=b;
        b=c;
        System.out.println( b+""+a);
        a=a+b;
        b=a-b;
        b=a-b;
        System.out.println(a+" "+b);

















































        }
    }


