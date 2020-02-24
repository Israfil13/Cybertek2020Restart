package day46;

public class Saving_Account extends BankAccount{
    double interestRate;

    @Override
    public String toString() {
        return "Saving_Account{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public Saving_Account(String accountHolder, long accountNumber, double balance, double interestRate )
    {
        super(accountHolder,accountNumber,balance);
        this.interestRate=interestRate;

    }
  @Override
    public void  withdraw(int amount){
        super.withdraw(amount);
        balance-=30;
    }
   @Override
    public void deposit(int amount ){
       super.deposit(amount);
       balance+=amount*0.042;
    }

    public static void main(String[] args) {
        Saving_Account s1=new Saving_Account("Mohamed",12345,500,4.2);
        System.out.println("s1 = " + s1);
        s1.withdraw(100);
        System.out.println("s1 = " + s1);
        s1.deposit(100);
        System.out.println("s1 = " + s1);
    }
}
