package Muxtar_Review.Day29_Return_Method_OVerloading;

import java.util.Arrays;

public class Max_Array {
    public static void main(String[] args) {
    int []nums ={4,89,5,1};
      int max=max(nums);
        System.out.println(max);

        String [] names={"Israfil","Nigar","Sohrab","Lala"};
        String longest=longest(names);
        System.out.println(longest);

        int []numsarr={12,44,5,12,96,36};
        int[] decending=decending(numsarr);
        System.out.println(Arrays.toString(decending));

    }



    public static int  max (int [] nums ){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }



    public static String longest (String [] str){
       String lonword="";
        int max=0;
        for (int i = 0; i <str.length ; i++) {
            if (str[i].length()>max){
                max=str[i].length();
                lonword=str[i];
            }
        }
        return lonword;
    }



    public static int []  decending (int [] nums){
        Arrays.sort(nums);
        int [] decending=new int [nums.length];
        int z=0;
        for (int i = nums.length-1; i >=0 ; i--) {
            decending [z]=nums [i];
              ++z;
        }
        return decending;
    }
}
