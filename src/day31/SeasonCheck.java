package day31;

public class SeasonCheck {
    public static void main(String[] args) {

        decideSeasonAction("winter");
        String myseason="asdf";
        decideSeasonAction(myseason);
    }

    public static void decideSeasonAction(String season){
        switch (season){
            case "winter":
                System.out.println("This is winter");
                break;
            case "spring":
                System.out.println("This is spring");
                break;
            case "summer":
                System.out.println("This is summer");
                break;
            case "fall":
                System.out.println("This is fall");
                break;
            default:{
                System.out.println("INVALID SEASON");
            }

        }



    }






}
