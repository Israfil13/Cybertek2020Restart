package day42;

public class Computer {
   private String brand;
   private int ram;
    private double price;


    public void runProgram (){
        System.out.println(this.brand + " is running prgram with the "+ this.ram + " size");
    }

    public void calculate(){
        System.out.println(brand+" is calculating");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram<=128 && ram>=1){
            this.ram = ram;
        }

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        if (price>20){
            this.price = price;
        }




    }
}
