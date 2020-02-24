package day46;

public class CheckingAccount extends BankAccount {
//    String accountHolder;
//    long accountNumber;
//    double balance;

    public CheckingAccount(String accountHolder, long accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void deposit(int amount) {
       if (amount>3000) {
           super.deposit(amount+200);
       }else {
           super.deposit(amount);
       }



    }

    public static void main(String[] args) {

        CheckingAccount c1=new CheckingAccount("Israfil",12345,10000);
       c1.deposit(100);
        System.out.println("c1 = " + c1);
        c1.deposit(4000);
        System.out.println("c1 = " + c1);
        c1.withdraw(100);
        System.out.println(c1);


    }


}
