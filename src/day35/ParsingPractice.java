package day35;

public class ParsingPractice {
    public static void main(String[] args) {
        String sentence
                = "I bought 3 tomato and the price was 3.14 each";
// How much is your final checkout price
// The count is always 3rd word
// The price is always at 2nd word from the last
        String [] arrsentence=sentence.split(" ");
        float finalprice=Integer.valueOf(arrsentence[2])*Float.parseFloat(arrsentence[arrsentence.length-2]);
        System.out.println("finalprice = " + finalprice);

    }
}
