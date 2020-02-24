package day32;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {
        arrayprinter(new int[]{8,5,1});
        int[] scores={2,5,8,9,6};
        arrayprinter(scores);
        printintArray(scores);
        printMinArray(scores);
        printsumArray(scores);
        printmorethan60(new int[]{45,88,96,52,66});
        printmore60(new int[]{85,88,96,72,66});

    }


    public static void arrayprinter(int[]nums){
        System.out.println("arrays has items : "+ Arrays.toString(nums));
    }


    public static void printintArray(int[]nums){
       int max=0;
        for (int i = 0; i <nums.length ; i++) {
            if (max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("max = " + max);    }


        public static void printMinArray(int[]nums){
       int min=nums[0];
        for (int eachnum:nums){
            if (eachnum<min){
                min=eachnum;
            }
        }
            System.out.println("min = " + min);
        }


        public static void printsumArray(int[]nums){
        int sum=0;
            for (int eachnum:nums){
                sum+=eachnum;
            }
            System.out.println("sum = " + sum);
        
        
        }

    public static void printmorethan60(int[]nums){
      int count=0;
        for (int eachnum:nums){
          if (eachnum>60){
              ++count;
          }
        }
        if (count==nums.length){
            System.out.println("Everyone passed");
        }else{
            System.out.println("someone failed");
        }


    }


    public static void printmore60(int[]nums){

        boolean allpased=true;
        for (int eachnum:nums){
            if (eachnum<=60){
                allpased=false;
                System.out.println("Someone failed");
                break;
            }

            }if (allpased){
            System.out.println("All passed");

        }

    }








}
