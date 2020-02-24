package day41;

public class TV {
    String brand;
    boolean isON;
    int currentChannel;

    public void turnOn() {

        if (!isON) {
            System.out.println("TV is turn ON");

            isON = true;
        }

    }

    public void turnOff() {
        if (isON) {
            System.out.println("TV is turn OFF");
            isON = false;
        }
    }

    public int getcurrentChannel() {

        return currentChannel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isON=" + isON +
                ", currentChannel=" + currentChannel +
                '}';
    }

    public void setCurrentChannel(int newChannel) {
        if (isON == true) {
            if (newChannel>0&&newChannel<=50) {
                currentChannel = newChannel;
            }else {
                System.out.println("Invalid Channel");
            }
        } else {
            System.out.println("Turn on TV first");
        }


    }
}