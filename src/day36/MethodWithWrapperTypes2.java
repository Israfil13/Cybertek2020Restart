//package day36;
//import java.lang.Integer
//public class MethodWithWrapperTypes2 {
//    public static void main(String[] args) {
//        // It's expecting 2 Integer object
//        // and we used Integer.valueOf to provide 2 Integer Objects
//        sumAndPrint(Integer.valueOf(23), Integer.valueOf(10));
//        // It's expecting 2 Integer object
//        // and we used new keyword to provide 2 Integer Objects
//        sumAndPrint(new Integer(23), new Integer(10));
//        // i1 is a variable with data type Integer
//        // and it can store integer Object
//        // what's deal here with 12 ?? -->> autoboxing
//        Integer i1 = 12;
//        Integer i2 = 20;
//        sumAndPrint(i1, i2);
//        // we directly passed int
//        // knowing that autoboxing can take care of converting to object
//        // if not specified otherwise , this is recommended
//        sumAndPrint(23, 10);
//
//        System.out.println("-----------  method with int parameter ------");
//        printTheDoubledValue(10);
//        // Why we can pass Integer Object to a method that accept int
//        // It will turn it into int by the power of auto-unboxing
//        printTheDoubledValue(new Integer(10));
//
//
//    }
//
//    @@ -32,6 +38,7 @@ public static void main(String[] args) {
//     *
//     * @param num1 type Integer , first number to add
//                * @param num2 type Integer , second number to add
//                * @return
//     */
//        public static void sumAndPrint(Integer num1, Integer num2) {
//            // We can not add two object
//            @@ -43,5 +50,17 @@ public static void sumAndPrint(Integer num1, Integer num2) {
//
//            }
//
//            /**
//             * This method will print the doubled value of what user passed
//             *
//             * @param x
//             * @return
//             */
//            public static void printTheDoubledValue(int x) {
//
//                System.out.println("after doubling x = " + (x * 2));
//
//            }
//}
