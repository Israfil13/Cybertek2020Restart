package aRepl_Practice;

public class Num163_Method_with_Return {
    public static void main(String[] args) {
       String arr[]={"a","foo","bar","foo","bla"};
       String t="foo";
        System.out.println(count_appearance(arr,t));
    }
    public static int  count_appearance(String[] arr,String t)
    {       int count=0;
        for( String eachwor:arr){
            if (eachwor.toLowerCase().equals(t)){
                count++;
            }
        }

        return count;
    }

}
