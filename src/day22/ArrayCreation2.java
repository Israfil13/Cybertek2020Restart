package day22;

public class ArrayCreation2  {
    public static void main(String[] args) {
        int[]ages=new int[]{3,5,11,33,57,18};
        int itemCount=ages.length;

        System.out.println(itemCount);

        for (int i = 0; i <= itemCount-1; i++) {
            System.out.println(ages[i]);

        }

        int[]areaCOde={703,346,300,665};
        for (int i = 0; i <areaCOde.length ; i++) {
            System.out.println(areaCOde[i]);

        }

    }
}
