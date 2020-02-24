package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int yourfav=300;
        int myfav=yourfav;
        myfav=299;
        System.out.println("yorfav = " + yourfav);

        long[] nums= {10,40,20};
       //nums[0]=nums[0]*2;
       // System.out.println(nums[0]);
        for (int i = 0; i < 3; i++) {
            nums[i]=nums[i]*2;
        }

        for (int i = 0; i <3 ; i++) {
            long eachitem=nums[i];
            eachitem=100;
            System.out.println(eachitem);
        }



        for (int i = 0; i <3; i++) {
            System.out.println(nums[i]);
        }


    }
}
