package day29;

public class AllHeros {
    public static void main(String[] args) {
        String [] allheroes={"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero:allheroes){
            String hero=eachHero;
            String splithero[]=hero.split("-");
            String fullname=splithero[1];

            int lenghoffullname=splithero[1].length();
            String stars="";
            for (int i = 0; i <lenghoffullname ; i++) {
                stars=stars+"*";
            }

            System.out.println(splithero[0]+" "+ fullname.replace(fullname,stars));

            System.out.println(splithero[0] + " "+stars);
        }







    }
}
