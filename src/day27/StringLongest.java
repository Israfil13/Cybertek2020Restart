package day27;

public class StringLongest {
    public static void main(String[] args) {
        String[] deveTeam={"Vladislav","Hasan","Tolkun","Abide"};
        String[] testerTeam={"Zhibekchach","Mohammed Sohrabi","Nursultan"};
        String[] baTeam={"Lisa","Ershad","Naila"};

        String [][] scrumTeam={deveTeam,testerTeam,baTeam};
        String longestname="";
        int longest=scrumTeam[0][0].length();

        for (String[] eacharr:scrumTeam){
            for (String eachstr:eacharr){
                if (longest<eachstr.length()){
                    longest=eachstr.length();
                    longestname=eachstr;
                }

            }
        }
        System.out.println("longest = " + longest);



        for (String[] eacharr:scrumTeam){
            for (String eachstr:eacharr) {

                if (longest==eachstr.length()){
                    System.out.println("longest = " + eachstr);
                }


            }}
    }
}
