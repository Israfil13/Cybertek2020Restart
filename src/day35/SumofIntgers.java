package day35;

public class SumofIntgers {
    public static void main(String[] args) {
        String str = "A34B123C4X";
        char[] allChars=str.toCharArray();
        int sum=0;

        for (char eachchar:allChars){
            if (Character.isDigit(eachchar)){
                int eachnum=Integer.parseInt(eachchar+"");
                sum+=eachnum;
            }
        }
        System.out.println("sum = " + sum);

//        int sum=0;
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                sum +=Integer.parseInt(str.substring(i, i+1));
//            }
//        }
//        return sum;
//    }



//        int sum = 0;
//        char[] eachInStr = str.toCharArray();
//        for (char each : eachInStr) {
//            if (Character.isDigit(each)) {
//                sum += Integer.parseInt(String.valueOf(each));
//            }
//        }
//        return sum;
//    }




    }
}
