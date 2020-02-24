package aRepl_Practice;

public class TV {
    private int channel=1;
    private int volumeLevel=1;
    private boolean on=false;
    private String brand="undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel){
        if(on==false){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else if(volumeLevel<1 || volumeLevel>7){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else{
            this.volumeLevel=volumeLevel;
        }
    }

    public int getChannel(){
        return channel;
    }



    public void setChannel(int channel){
        if(on==false){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else if(channel<=0 || channel>120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else{
            this.channel=channel;
        }

    }




    public void channelUp(){
        ++channel;
    }

    public void channelDown(){
        --channel;
    }

    public void volumeUp(){
        ++volumeLevel;
    }

    public void volumeDown(){
        --volumeLevel;
    }


    public boolean isON(){
        return on;
    }




    public void turnOFF(){
        if(on==false){
            System.out.println("TV is already OFF");
        }else{
            on=false;
        }

    }





    public void turnOn(){
        if(on==true){
            System.out.println("TV is already ON");
        }else{
            on=true;
        }

    }



}

