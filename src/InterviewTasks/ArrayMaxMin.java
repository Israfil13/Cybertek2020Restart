//package InterviewTasks;
//
//public class ArrayMaxMin {
//    public static void main(String[] args) {
//
//        ​
//        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4, -1, -5, -3};
//​
//        int maxOne = 0;
//        int maxTwo = 0;
//​
//        for (int each : arr) {
//            if (each > maxOne) {
//                maxTwo = maxOne;
//                maxOne = each;
//            } else if (each > maxTwo) {
//                maxTwo = each;
//            }
//        }
//​
//        System.out.println("maxone = " + maxOne);
//        System.out.println("maxTwo = " + maxTwo);
//​
//​
//        //int[] arr = {6, 5, 3, 1, 8, 7, 2, 4, -1, -5, -3};
//        int minOne = 0;
//        int minTwo = 0;
//​
//        for (int each : arr) {
//            if (each < minOne) {
//                minTwo = minOne;
//                minOne = each;
//            } else if (each < minTwo) {
//                minTwo = each;
//            }
//        }
//        System.out.println("minone = " + minOne);
//        System.out.println("minTwo = " + minTwo);
//    }
//    }
//
