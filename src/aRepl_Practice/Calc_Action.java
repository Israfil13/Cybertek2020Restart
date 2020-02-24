package aRepl_Practice;

public class Calc_Action {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        a.minus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2

    }
}
