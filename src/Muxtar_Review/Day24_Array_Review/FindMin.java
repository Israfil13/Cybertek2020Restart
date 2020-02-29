package Muxtar_Review.Day24_Array_Review;

public class FindMin {
    public static void main(String[] args) {
int [] nums={12,2,44,2,12,3};

        System.out.println("findMin(nums) = " + findMin(nums));
    }


    public static int findMin(int [] nums){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if(min>nums[i]){
                min=nums[i];
            }
        }

        int seconMin=Integer.MAX_VALUE;
        for (int each :nums){
            if (each<seconMin && each!=min){
                seconMin=each;
            }
        }

        return  seconMin;

//        return min;
    }
}
