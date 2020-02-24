package aRepl_Practice;

public class NUm176_Method_with_Return_Booking {
    public static void main(String[] args) {
        System.out.println(simpleRoomBook(true,7,11,2018));
    }




    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {
        if (isAvailable==true ){
//            if (month,day,year<2,11,2018)
            return true;
        }else {
            return false;

        }

    }
}
