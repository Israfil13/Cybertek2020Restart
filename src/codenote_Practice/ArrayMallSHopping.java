package codenote_Practice;

public class ArrayMallSHopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        //TASK 5. Find the most expensive item and print all details
        //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}

        double maxPrice = prices[0];
        int maxPriceIndex = 0;


        // YOUR CODE GOES HERE

        for (int i = 0; i <prices.length ; i++) {
            if (maxPrice<prices[i]){
                maxPrice=prices[i];
                maxPriceIndex=i;
            }

        }





        // BELOW IS ALREADY WRITTEN FOR YOU
        System.out.println("Most expensive item:");
        System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);




    }
}
