package day48;

public class Kangroo implements Bouncible,BoxerWithPouch {
    String name;
    int jumpDistance;

    public Kangroo(String name,int jumpDistance){
        this.name=name;
        this.jumpDistance=jumpDistance;
    }

    public  void bounce(){
        System.out.println("Kangroo is jumping "+jumpDistance+" m distance");
    }




    @Override
    public void box() {
        System.out.println("Kangroo with name "+name +" is boxing");

    }

    @Override
    public void carryChildinThePockey() {
        System.out.println("Kangroo with name "+name+" is carring child in the pocket");
    }










    @Override
    public String toString() {
        return "Kangroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';





    }
}
