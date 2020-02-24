package day45;

public class Earth extends Planet {

  int population;

    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }

    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
        this.population = population;
    }

    public static void main(String[] args) {

        Earth e1=new Earth(9.81,5000,true,8000000);
        System.out.println("e1 = " + e1);



    }


}
