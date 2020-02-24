package day48;

public class Ball implements Bouncible {

    String shape,color;


    public Ball (String shape,String color){
        this.color=color;
        this.shape=shape;
    }

    public  void bounce(){
        System.out.println("Ball is bouncing while gravity is "+Ball.GRAVITY);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
