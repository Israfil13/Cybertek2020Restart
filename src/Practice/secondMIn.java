package Practice;

public class secondMIn {
    public static void main(String[] args) {

        int[] nums={3,5,7,9};

        System.out.println(secondmin(nums));

        int[] elements  = {0 , 4 , 9 , 4, 5 };
        int smallest = 0;
        int secondSmallest = 0;

        for (int i = 0; i < elements.length; i++)
        {
            for (int j = 0; j < elements.length; j++)
            {
                if (elements[i] < smallest)
                {
                    smallest = elements[i];

                    if (elements[j] < secondSmallest)
                    {
                        secondSmallest = elements[j];
                    }
                }
            }

        }
        System.out.println(secondSmallest);


        int[] eeements = {1,2,3,4,5};
        int ssmallest = Integer.MAX_VALUE;
        int ssecondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < eeements.length; i++) {
            if (eeements[i] < ssmallest) {
                ssecondSmallest = ssmallest;
                ssmallest = eeements[i];
            } else if (eeements[i] < ssecondSmallest) {
                ssecondSmallest = eeements[i];
            }
        }
        System.out.println(ssecondSmallest);


    }

    public static int secondmin(int [] nums){
        int min=nums[0];
        int secondmin=nums[1];
        for (int i = 0; i <nums.length ; i++) {
            if (min>nums[i]){
                min=nums[i];
        }
        }


        for (int i = 0; i <nums.length ; i++) {
            if (secondmin>nums[i] && nums[i]!=min){
                secondmin=nums[i];
        }
        }

        return secondmin;
    }


}
