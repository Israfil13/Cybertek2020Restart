package codenote_Practice;

import com.sun.jdi.Method;

import java.util.ArrayList;

public class Arraylist_Practice_Scores {
    public static void main(String[] args) {
//        Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
//* print pass if its more than 60 fail if not
//                * count how many score are more than 90
//                * get the average score
//                * update the values with score-grade pair
//        for example
//        79C , 54F, 100A, 65D, 44F , 89B , 95A
//        Optionally create 4 methods according to above criteria
        ArrayList<String> scores = new ArrayList<>();
        scores.add("76");
        scores.add("54");
        scores.add("100");
        scores.add("89");
        scores.add("44");
        scores.add("95");

        checkscoresFail(scores);
        Morethan90(scores);
        AverageScores(scores);
        ScoreGraidPair(scores);

    }
        public static void checkscoresFail (ArrayList<String> scores){

            for (int i = 0; i <scores.size() ; i++) {
            if (Integer.parseInt(scores.get(i))<60) {
                System.out.println(scores.get(i)+" It is Failed");
            }else {
                System.out.println(scores.get(i)+" It is Passed");
            }

            }

        }

          public static void Morethan90 (ArrayList<String> scores){
              int count=0;
              for (int i = 0; i <scores.size() ; i++) {
                if (Integer.parseInt(scores.get(i))>90){
                    ++count;
                }
              }
              System.out.println(count+" Scores more than 90");

          }

         public static void AverageScores (ArrayList<String> scores){
            int sum=0;
            int average=0;
             for (int i = 0; i <scores.size() ; i++) {
                sum+=Integer.parseInt(scores.get(i));
             }
             average=sum/scores.size();
             System.out.println("Average score is " + average );
         }


    public static void ScoreGraidPair (ArrayList<String> scores) {
        for (int i = 0; i < scores.size(); i++) {
            if (Integer.parseInt(scores.get(i)) <= 100 && Integer.parseInt(scores.get(i)) >= 90) {
                System.out.println(scores.get(i) + "A");
            } else if (Integer.parseInt(scores.get(i)) <= 90 && Integer.parseInt(scores.get(i)) >= 80) {

                System.out.println(scores.get(i) + "B");
            } else if (Integer.parseInt(scores.get(i)) <= 80 && Integer.parseInt(scores.get(i)) >= 70) {

                System.out.println(scores.get(i) + "C");
            } else if (Integer.parseInt(scores.get(i)) <= 70 && Integer.parseInt(scores.get(i)) >= 60) {

                System.out.println(scores.get(i) + "D");
            } else if (Integer.parseInt(scores.get(i)) <= 60 && Integer.parseInt(scores.get(i)) >= 30) {

                System.out.println(scores.get(i) + "F");
            }


        }


    }}