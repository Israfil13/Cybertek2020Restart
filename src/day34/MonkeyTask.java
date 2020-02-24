package day34;

public class MonkeyTask {
    public static void main(String[] args) {
        System.out.println(monkeytrouble(true,true));
        System.out.println(monkeytrouble2(true,true));

    }

    /**
     *
     * @param asmile
     * @param bsmile
     * @return
     */
     public static boolean monkeytrouble(boolean asmile,boolean bsmile){
        if (asmile && asmile){
            return true;
        }
        else if(!asmile && !bsmile) {
            return true;
        }else {
            return false;

        }
//        return asmile==bsmile;
//           return asmile && bsmile || !asmile && !bsmile;


     }

    public static String monkeytrouble2 (boolean asmile,boolean bsmile){
        if (asmile && asmile ||!asmile && !bsmile ){
            return "Yes";
        } else {
            return "No";
        }

    }


}
