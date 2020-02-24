package day08;

public class multiBranchStatement {
    public static void main(String[] args) {
        int curretnSpeed = 85;


        if (curretnSpeed>90) {
            System.out.println("More than 90 --- You gonna go to jail");
        }
        else  if (curretnSpeed>80){
            System.out.println("Your current speed less or equal 90 more than 80------ reckless driving");

        }
        else if (curretnSpeed>70) {
            System.out.println("you are speeding equal 80 or more than 70 ---- Points taken");
        }

        else if (curretnSpeed>60) {
            System.out.println("your Speed is less than or equal 70 more than 60");
        }
        else{
            System.out.println("Keep Driving");
        }



    }
}
