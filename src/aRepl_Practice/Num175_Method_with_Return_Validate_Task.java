package aRepl_Practice;

public class Num175_Method_with_Return_Validate_Task {
    public static void main(String[] args) {

    }

    public  boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {
        if (notEmpty==true&&taskId==currentId+1){
        return true;
    }else{

        return false;
    }


    }
}
