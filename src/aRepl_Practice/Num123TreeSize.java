package aRepl_Practice;

public class Num123TreeSize {
    public static void main(String[] args) {
            int year=0;
            int treesize=0;
        for (int i = 1; i <=3 ; i++) {
            treesize=treesize+1;
            year=year+1;
            System.out.println("year "+year+"-"+"growth "+1+" cm");
            System.out.println("tree size: "+treesize);
        }
        for (int i = 4; i <=10 ; i++) {
            treesize=treesize+2;
            year=year+1;
            System.out.println("year "+year+"-"+"growth "+2+" cm");
            System.out.println("tree size: "+treesize);
        }
    }
}
