package day44.day44sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {
    int adminID;

    public void sendAtChannelMessage(){
        System.out.println("Message is sended to all");
    }

    public void deleteMessage(){
        System.out.println("Message is deleted");
    }

    public void addChannel(){
        System.out.println("students were added to channel");
    }

  public SlackAdminUser(String name,String status,int adminID){
        this.name=name;
        this.status=status;
        this.adminID=adminID;
  }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminID='" + adminID + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SlackAdminUser s1=new SlackAdminUser("Akbar","Admin",111);
        System.out.println("s1 = " + s1);
        s1.sendAtChannelMessage();
        s1.sendMessage();



    }








}
