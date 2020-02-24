package day37;

import java.util.ArrayList;

public class WarmUp {
    public static void main(String[] args) {
//        Warm up:
//        Create Arraylist of String and store
//        teamMates
//        print one by one
//        print reverse
//        print first last
//        print 2 at a time
//        concat everyone in one string separated by -

        ArrayList<String> teamMates=new ArrayList<>();
        String [] arrteam={"Mykyta","Ashyr","Gizem","Bulent","Ilhan","Kamran","Hasan","Rauf"};
        for (String eachname:arrteam){
            teamMates.add(eachname);
        }
        System.out.println(teamMates);

        for (int i = teamMates.size()-1; i >=0 ; i--) {
            System.out.print(teamMates.get(i)+" ");
        }
        System.out.println();

        for (int i = 0; i <teamMates.size() ; i++) {
            System.out.print(teamMates.get(i)+" ");

        }
        System.out.println();
        for (int i = 0; i <teamMates.size()-1 ; i++) {
            System.out.println( "Item "+ (i+1) + "\t " +teamMates.get(i)+" "+teamMates.get(i+1));
        }

        String result="";
        for (int i = 0; i <teamMates.size() ; i++) {
            if (i!=teamMates.size()-1){
            result+=teamMates.get(i)+"-";
        }else {
                result+=teamMates.get(i);
            }

    }
        System.out.println(result);

        String teamString=teamMates.toString();
        teamString=teamString.replace(",","-").replace("[","").replace("]","");
        System.out.println(teamString);
        String temp=teamMates.get(0);
        teamMates.set(0,teamMates.get(teamMates.size()-1));
        teamMates.set(teamMates.size()-1,temp);
        System.out.println(teamMates);





    }}
