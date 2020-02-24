package Naveen;

public class ICCBank implements USBank,MerkeziBank {


    @Override
    public void educationLoan() {
        System.out.println("ICC edu loan");
    }

    @Override
    public void creditLoan() {
        System.out.println("ICC credit loan");
    }

    @Override
    public void carLoan() {
        System.out.println("ICC car loan");
    }

    @Override
    public void debit() {
        System.out.println("ICC debit");
    }

    @Override
    public void credit() {
        System.out.println("ICC credit");
    }

    @Override
    public void transfermoney() {
        System.out.println(" icc transfer money");
    }
    @Override
    public   void trading(){
        System.out.println("ICC trading");
    }

    public void mutualFUnds(){
        System.out.println("ICC mutual funds");
    }

    public void  insurance (){
        System.out.println("ICC insurance");
    }



}
