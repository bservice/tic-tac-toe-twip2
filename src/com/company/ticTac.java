package com.company;

import java.util.Random;

/**
 * Created by bs666 on 12/22/17.
 */
public class ticTac {
    Random rand = new Random();
    Random rand2 = new Random();
    int randRow = rand.nextInt(3);
    int randCol = rand2.nextInt(3);
    int randRow2 = rand.nextInt(3);
    int randCol2 = rand2.nextInt(3);
    int randRow3 = rand.nextInt(3);
    int randCol3 = rand2.nextInt(3);
    int randRow4 = rand.nextInt(3);
    int randCol4 = rand2.nextInt(3);
    int randRow5 = rand.nextInt(3);
    int randCol5 = rand2.nextInt(3);
    int randRow6 = rand.nextInt(3);
    int randCol6 = rand2.nextInt(3);
    public static Random ranNum = new Random();
    public static boolean win = false;

    public static String board[][] = new String[3][3];//Creates the board

    public static void move(int r, int c, int w) {
        if(w == 0)
            board[r][c] = String.valueOf('X');
        else
            board[r][c] = String.valueOf('O');
        checkWin();

    }

    public static void createBoard() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                board[i][j] = String.valueOf('-');
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(board[i][j]+ "\t" + "\t");
            }
            System.out.println();
        }
    }

    public static void randomC()
    {
        int ranR = ranNum.nextInt(3);
        int ranC = ranNum.nextInt(3);
        move(ranR, ranC, 1);

    }
    public static  boolean checkWin ()
    {
        if(board[0][0]== board[0][1]&&board[0][2]==board[0][0])
            win = true;
        return win;
    }



}
