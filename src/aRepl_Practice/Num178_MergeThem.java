package aRepl_Practice;

class Num177_MergeThem {
    public static void main(String[] args) {
        System.out.println(mergeStrings("milan","inter"));
    }
    public static String mergeStrings(String one, String two) {
        String merged="";
        for (int i = 0; i <one.length() ; i++) {
            merged += one.charAt(i);

        }
            for (int j = 0; j <two.length() ; j++) {

                merged+=two.charAt(j);
            }






        return merged;


        }


    }



