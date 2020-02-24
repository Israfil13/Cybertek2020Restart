package aRepl_Practice;

public class Num188 {
    public static void main(String[] args) {

    }

    public int findMax(int[] num) {
        int max = 0;
        for (int each : num) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }

    public double findMax(double[] num) {
        double max = 0;
        for (double each : num) {
            if (max < each) {
                max = each;
            }
        }
        return max;
    }
}