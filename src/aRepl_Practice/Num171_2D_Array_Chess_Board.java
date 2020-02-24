package aRepl_Practice;

import java.util.Arrays;

public class Num171_2D_Array_Chess_Board {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i <chessBoard.length ; i++) {
            for (int j = 0; j <chessBoard[i].length ; j++) {
                chessBoard[i][j]=(""+(i+1)+""+(char)('a'+j));
            }

        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
