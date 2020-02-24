package day24;

import java.util.Arrays;

public class ArrayMethodSorting {
    public static void main(String[] args) {


        int[] scores={99,44,66,200,78};
        System.out.println(scores[0]);

        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);

        char[] namechars={'a','/','d','c','w'};

        System.out.println(Arrays.toString(namechars));
        Arrays.sort(namechars);
        System.out.println(Arrays.toString(namechars));

        String[] superHeros={"Superman","Batman","WM","Aquaman","Cyborg","100","9","09"};

        Arrays.sort(superHeros);
        System.out.println(Arrays.toString(superHeros));


        boolean[] fiveswitchonoffs={false,true,true,false,true};

        System.out.println(Arrays.toString(fiveswitchonoffs));
        //Arrays.sort(fiveswitchonoffs);does not work for boolean




    }
}
