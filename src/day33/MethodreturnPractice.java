package day33;

public class MethodreturnPractice {
    public static void main(String[] args) {
        System.out.println(dayCode(8));
        System.out.println(weekday(4));
    }

    public static String dayCode (int day) {
        String todayis = " ";
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Funday");



        }

        return todayis;
    }

        public static String weekday (int day){
        String[] weekdays={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
               String today= weekdays[day];
           return today;

            }


        }



















