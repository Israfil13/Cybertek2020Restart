package codenote_Practice;

public class ArrayFindUnique {
    public static void main(String[] args) {
        int[]   numbers = { 1, 1, 2, 2, 3, 4, 4, 5, 5,6,7,8,9};
        for (int i = 0; i <numbers.length ; i++) {
                int count = 0;
            for (int n = 0; n <numbers.length ; n++) {
               if (numbers[n]==numbers[i]){
                ++count;}
            }if (count==1){
                System.out.println("unique " + numbers[i]);
            }
        }



    }
}
