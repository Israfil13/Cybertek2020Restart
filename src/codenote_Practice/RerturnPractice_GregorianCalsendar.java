package codenote_Practice;

public class RerturnPractice_GregorianCalsendar {
    public static void main(String[] args) {
//        In the Gregorian calendar three criteria must be taken into account to identify leap years:
//        The year can be evenly divided by 4;
//        If the year can be evenly divided by 100, it is NOT a leap year, unless;
//        The year is also evenly divisible by 400.  Then it is a leap year.
//        Write a method
        System.out.println(isleapyear(2000));
    }
    public static boolean isleapyear(int year){
            if (year%4==0&&year%100==0&&year%400==0){
           return  true;
//
            }

        return false;

    }
}
