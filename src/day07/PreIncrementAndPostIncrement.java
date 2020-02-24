package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int apple = 8;
        apple++;
        System.out.println(apple);
        // apple ++ , when ++ comes after the variable it is called post increment
        //it will increase the value ,but it wil reflect uncreased value next time the variable show up

        System.out.println(++apple);
        System.out.println(apple++);
        System.out.println(apple);

        int score = 50;
        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println(score--);
        System.out.println(score);


    }
}
