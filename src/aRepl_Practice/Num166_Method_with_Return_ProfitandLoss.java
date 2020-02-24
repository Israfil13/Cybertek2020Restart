package aRepl_Practice;

public class Num166_Method_with_Return_ProfitandLoss {
    public static void main(String[] args) {
    }
    public static String profitloss(int buyprice,int sellprice){

        if (sellprice>buyprice) {
            return "profit";
        }else if (buyprice>sellprice){
            return "loss";
        }else {
            return "no loss";
        }
    }
}
