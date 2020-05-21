package BOOTCAMP;

public class Count_Java {


    public static void main(String[] args) {
        String java="I love java,i love java,i love java";
        System.out.println(countJava(java));
        System.out.println(countJava2(java));
    }

    public static int countJava(String java){
        int count=0;
        for (int i = 0; i <java.length()-3 ; i++) {
            if (java.substring(i,i+4).equalsIgnoreCase("java")){
                count++;
            }
        }
        return count;
    }

    public static int countJava2(String str){
        int java=0;

        while (str.contains("java")){
            java++;

            str=str.replaceFirst("java","");
        }

        return java;

    }



}
