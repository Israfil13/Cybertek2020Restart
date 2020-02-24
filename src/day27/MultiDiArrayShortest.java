package day27;

public class MultiDiArrayShortest {
    public static void main(String[] args) {
        String[] deveTeam={"Vladislav","Hasan","Tolkun","Abide"};
        String[] testerTeam={"Zhibekchach","Mohammed Sohrabi","Nursultan"};
        String[] baTeam={"Lisa","Ershad","Naila"};
        String [][] scrumTeam={deveTeam,testerTeam,baTeam};

        String shortest=scrumTeam[0][0];
        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j <scrumTeam[i].length ; j++) {
                if (shortest.length()>scrumTeam[i][j].length()){
                    shortest=scrumTeam[i][j];
                }
            }
        }
        System.out.println(shortest);
        
        
        
        
        
    }
}
