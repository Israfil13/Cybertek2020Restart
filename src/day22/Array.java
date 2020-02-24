package day22;

public class Array {
    public static void main(String[] args) {

        int[]scores=new int[4];

        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        scores[1]=99;

//
//        for (int i = 0; i <=3 ; i++) {
//            System.out.println(scores[i]);

            int num[]=new int [3];
            System.out.println(num[0]);
            System.out.println(num[2]);
            System.out.println(num[1]);

            byte[]data=new byte[4];
            data[0]=5;
            data[1]=24;
            data[2]=21;
            data[3]=11;
        for (int i = 0; i <=3 ; i++) {
            System.out.println(data[i]+" ");
        }
            data[3]=15;

        for (int i = 0; i <=3 ; i++) {
            System.out.println(data[i]);
        }

        }
    }

