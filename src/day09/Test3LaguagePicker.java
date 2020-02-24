package day09;

public class Test3LaguagePicker   {
    public static void main(String[] args) {
        String greeting="";
        int languageoption=8;

        if (languageoption==1){
            greeting="Hello";

        }else if (languageoption==2){
            greeting="Salam";

        }else if (languageoption==4){
            greeting="Privet";

        }else if (languageoption==5){
            greeting="Merhaba";

        }else if (languageoption==6){
            greeting="Szia";

        }else if (languageoption==7){
            greeting="bonjour";
            System.out.println( greeting +  " , SDET");
        }

        else {
            System.out.println("unknown option");
        }




    }
}
