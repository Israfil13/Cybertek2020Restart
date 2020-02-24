package day32;

public class TwoArraySize {
    public static void main(String[] args) {
compare2arraysize(new String[]{"Sezgin","Senay","Isafil"},new String[]{"Kelenter"});
   String[] names1={"Superman","Batman","Flash"};
   String[] names2={"wonder woman","Cyborg","Spider"};
compare2arraysize(names1,names2);

    }

    public static void  compare2arraysize(String arr1[],String arr2[]){
        if (arr1.length>arr2.length){
            System.out.println("array 1 has more item");
        }else if (arr1.length<arr2.length){
            System.out.println("array 2 has more item");
        }else{
            System.out.println("Same item count");
        }

    }




}
