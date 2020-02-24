package day23;

public class HomeworkArray {
    public static void main(String[] args) {


        int[] nums={1,2,3,9,5,6,7};
//        for (int i = nums.length-1; i >= 0; i--) {
//            System.out.println(nums[i]);}

//        int lastItem=nums.length;
//        System.out.println(lastItem);


//        System.out.println(nums.length/2+1);


//        int sum=0;
//        for (int i = 0; i < nums.length ; i++) {
//            sum+=nums[i];
//
//        }System.out.println(sum);

//        int sum=0;
//        int ave=0;
//        for (int i = 0; i < nums.length ; i++) {
//            sum+=nums[i];
//            ave= sum/nums.length;
//
//        }
//        System.out.println("ave = " + ave);

//        int max=0;
//        for (int i = 0; i <nums.length ; i++) {
//            if (max<nums[i]){
//                max=nums[i];
//            }
//
//
//        }   System.out.println(max);
//
        int min=nums[0];
        for (int i = 0; i <nums.length ; i++) {

            if (min>nums[i]) {
                min = nums[i];
            }

        }

        System.out.println(min);


        }
    }

