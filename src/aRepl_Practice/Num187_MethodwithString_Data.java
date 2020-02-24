package aRepl_Practice;

public class Num187_MethodwithString_Data {
    public static void main(String[] args) {
        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );
    }
    public static String lameDb(String db, String op,String id,String data)
    {
        if (op.equals("add")){
            return db+"#"+id+data;
        }else if (op.equals("edit")){
            String [] arr=db.split("#");
            return db.replace(arr[1],id+data);
        }else if (op.equals("delete")){
            String [] arr=db.split("#");
            return "#"+arr[1]+"#"+arr[2];

            //            return db.substring(db.indexOf("#"));
        }else {
            return db;
        }


    }//end lameDb
}
