package day47;

public class Triangle extends Shape {
   int height;
   int base;

   public Triangle(int height,int base){
       super("Triangle");
       this.base=base;
       this.height=height;
   }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public void calculateArea() {
        System.out.println(area = + height*base/2);
    }
}
