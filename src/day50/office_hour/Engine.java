package day50.office_hour;

public class Engine {
String type;
int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}
