package InterviewTasks;


import day22.Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int nums []={4,5,8,6,3,1};

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        System.out.print(Arrays.toString(nums));


        sort(nums );
        System.out.println(Arrays.toString(nums));
    }




    public static  void sort (int[] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }



}
