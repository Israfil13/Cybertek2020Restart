package day46;

public class SQL_Programmer extends Programmer {
    @Override
    public String toString() {
        return "SQL_Programmer{}";
    }
        @Override
    void code(){
       super.code();
        System.out.println("create database");

    }

    public static void main(String[] args) {
        SQL_Programmer s1=new SQL_Programmer();
        s1.code();

    }
}
