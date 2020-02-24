package day44;

public class Course_Action {
    public static void main(String[] args) {

        System.out.println("Course.counter = " + Course.counter);

        Course c1=new Course("Java","Foundation");
        System.out.println("Course.counter = " + c1.counter);
        Course c2=new Course("Selenium","Automation");
        Course c3=new Course("SQL","Database");
        Course c4=new Course("API","Webservices");
        Course c5=new Course("Agile","Softskill");

        System.out.println("Course.counter = " + Course.counter);

    }
}
