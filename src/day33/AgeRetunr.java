package day33;

public class AgeRetunr {
    public static void main(String[] args) {
        System.out.println(getage(1890));
int [] birthyear ={1999,122,2019,1987,1978,1964,399,2004};
      for (int eachyear:birthyear){

          System.out.println(getage(eachyear));
      }


    }

    public static int getage(int birtyear){
        int age=0;
        if(birtyear>=1900 && birtyear<=2020){
             age=2020-birtyear;
        }else{
            age=0;
        }

        return age;
    }






}
