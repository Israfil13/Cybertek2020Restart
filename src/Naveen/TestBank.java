package Naveen;

public class TestBank {
    public static void main(String[] args) {
        ICCBank ic=new ICCBank();
        ic.educationLoan();
        ic.carLoan();
        ic.insurance();

        ic.credit();

        System.out.println(USBank.min_bal);

        USBank us=new ICCBank();
        us.credit();



    }
}
