package codenote_Practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer {

    String location;
    String company ;
    int salary;
    boolean isFulltime;

    public void displayOfferDetails(){
        System.out.println("location+\",\"+company+\",\"+salary+\",\"+isFulltime = "
                        + location+","+company+","+salary+","+isFulltime);
    }

//    public void addtoLIst(){
//        List<String> listOffer=new ArrayList<>(Arrays.asList(location,company,String.valueOf(salary),String.valueOf(isFulltime)));
//        System.out.println(listOffer);
//    }

    public void add500(){
        if (salary<100000){
            salary+=5000;
        }
        System.out.println(salary);
    }








    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.location="Texas";
        offer1.company="BoA";
        offer1.salary=100000;
        offer1.isFulltime=true;
        offer1.displayOfferDetails();

        offer1.add500();

        Offer offer2=new Offer();
        offer2.location="North Carolina";
        offer2.company="Sysco";
        offer2.salary=120000;
        offer2.isFulltime=false;
        offer2.displayOfferDetails();


        Offer offer3=new Offer();
        offer3.location="Virgina";
        offer3.company="Capital One";
        offer3.salary=90000;
        offer3.isFulltime=true;
        offer3.displayOfferDetails();



        Offer offer4=new Offer();
        offer4.location="Washington";
        offer4.company="MasterCard";
        offer4.salary=1100000;
        offer4.isFulltime=true;
        offer4.displayOfferDetails();


        Offer offer5=new Offer();
        offer5.location="California";
        offer5.company="Amazon";
        offer5.salary=1200000;
        offer5.isFulltime=true;
        offer5.displayOfferDetails();


        List<Offer> offerlist=new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));


        for (Offer eeach:offerlist){
            eeach.add500();
        }



    }




}

