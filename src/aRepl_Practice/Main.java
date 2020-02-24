package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public String blogDb(ArrayList<String[]> r, String id)  {
            String st="";
        for (int i = 0; i <r.size() ; i++) {
            for (int j = 0; j <r.get(i).length ; j++) {
                if (r.get(i)[j].contains(id)){
                    st= r.get(i)[1]+"\n"+r.get(i)[2];
                }
            }
        }
    return st;
    }

    public static void main(String[] args) {
        Main m = new Main();
        ArrayList<String[]>  arr = new ArrayList<String[]>();
        arr.add(new String[]{"1","title 1","content"});
        arr.add(new String[]{"2","title 2","content"});
        arr.add(new String[]{"3","title 3","content3"});

        String post = m.blogDb(arr,"3");
        System.out.print(post);
        //should output:
        //title 3
        //content3


    }//end main
    }


