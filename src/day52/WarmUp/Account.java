package day52.WarmUp;

public class Account implements Transferable,Comparable<Account>{
    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int num){
        balance+=num;
    }
    public void withdraw(int num){
        balance-=num;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void transferAll(Account otherAccount) {
       // otherAccount.balance+=this.balance;
      //  this.balance=0;
        otherAccount.deposit(this.balance);
        this.withdraw(this.balance);
    }

    public void  transfer(Account otherAccount,int amount){
        otherAccount.deposit(amount);
        this.balance-=amount;

    }



    public boolean  isPalindrome(){
        String temp=this.name.toLowerCase().replace(" ","");
      String reverse="";
        for (int i = temp.length()-1; i >0; i--) {
            reverse+=temp.charAt(i);
        }
        return temp.equals(reverse);
    }

    @Override
    public int compareTo(Account otherAccount) {
            if (this.balance>otherAccount.balance){
                return 1;
            }else if (this.balance<otherAccount.balance){
                return -1;
            }else {
                return 0;
            }
    }
}
