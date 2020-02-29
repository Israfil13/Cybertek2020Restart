package Muxtar_Review.Day24_Array_Review;

public class FindMax {
    public static void main(String[] args) {

        int[] nums={23,3,4,5,65,22};
        System.out.println(findMax(nums));

    }
    public static int findMax(int[]nums){

      int max=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }

        int secondMax=0;
        for (int each:nums){
            if (each>secondMax && each!=max){
               secondMax=each;
            }
        }


        return secondMax;
//        return max;

    }






}
