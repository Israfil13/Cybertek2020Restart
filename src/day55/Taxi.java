package day55;

public class Taxi {
    int platenumber;
    Engine eng;
    Driver dr;


    public Taxi(int platenumber,Engine eng,Driver dr){
       this.platenumber=platenumber;
       this.eng=eng;
       this.dr=dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "platenumber=" + platenumber +
                ", eng=" + eng +
                ", dr=" + dr +
                '}';
    }

    public static void main(String[] args) {

        Engine en=new Engine("V6",400);
        Driver dr=new Driver("Mamed",111);
        Taxi t1=new Taxi(037,en,dr);
        System.out.println("t1 = " + t1);
        System.out.println(t1.dr.name+ " is driving a car with "+t1.eng.horsePower+" horsepower");
        int x=t1.platenumber;
        Driver y=t1.dr;
t1.dr.name.charAt(0);
    }
}

class Engine{
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }


}

class Driver{
    String name;
    int driverID;

    public Driver(String name,int driverID){
        this.name=name;
        this.driverID=driverID;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}