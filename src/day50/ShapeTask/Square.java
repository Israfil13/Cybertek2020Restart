package day50.ShapeTask;

public class Square extends Shape{

    int length;

    public Square(String name,int length){
        super(name);
        this.length=length;
    }



    @Override
    public void calculatearea() {
    area=length*length;
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with 90 degree ,length "+length+"with color" +COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }




}
