package day44;

public class SlackUser {
   protected String name;
    protected String status;

    public void sendMessage(){
        System.out.println(name+" is typing");
    }
  public void callSomeone(){
      System.out.println(name+" is calling");

  }
  public void addEMoji(){
      System.out.println("emoji is added");
  }




}
