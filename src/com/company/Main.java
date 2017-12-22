package com.company;


import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Let's play Tic Tac Toe");
        System.out.println("Pick coordinates for your moves (ex: 0 1 )");
        ticTac.createBoard();
        ticTac.printBoard();
        System.out.println("Pick a row");
        Scanner kb = new Scanner(System.in);
        int row1 = kb.nextInt();
        System.out.println("Pick a column");
        Scanner kb2 = new Scanner(System.in);
        int column1 = kb2.nextInt();


        ticTac.move(row1,column1,0);
        ticTac.printBoard();
        ticTac.randomC();
        System.out.println("Computers Turn shows:");
        ticTac.printBoard();
        System.out.println("Pick a row");
        row1 = kb.nextInt();
        System.out.println("Pick a column");
        column1 = kb2.nextInt();
        ticTac.move(row1,column1,0);
        ticTac.printBoard();
        /*
        a [row1][column1] = String.valueOf('X');


        a [randRow][randCol] = String.valueOf('O');
        if (a[randRow][randCol] == a[row1][column1] )
        {
            int newrandRow = rand.nextInt(3);
            int newrandCol = rand2.nextInt(3);
            a [newrandRow][newrandCol] = String.valueOf('O');
        }
        for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "\t");
            }
            System.out.println();
            System.out.println();
        }


        System.out.println("Pick a row");

        int row2 = kb.nextInt();
        System.out.println("Pick a column");

        int column2 = kb2.nextInt();
        a [row2][column2] = String.valueOf('X');
        a [randRow2][randCol2] = String.valueOf('O');
        if (a[randRow2][randCol2] == a[row2][column2] )
        {
            int newrandRow = rand.nextInt(3);
            int newrandCol = rand2.nextInt(3);
            a [newrandRow][newrandCol] = String.valueOf('O');
        }
        for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "\t");
            }
            System.out.println();
            System.out.println();
        }



        System.out.println("Pick a row");
        Scanner kb5 = new Scanner(System.in);
        int row3 = kb.nextInt();
        System.out.println("Pick a column");
        Scanner kb6 = new Scanner(System.in);
        int column3 = kb2.nextInt();
        a [row3][column3] = String.valueOf('X');
        a [randRow3][randCol3] = String.valueOf('O');
        if (a[randRow3][randCol3] == a[row3][column3] )
        {
            int newrandRow = rand.nextInt(3);
            int newrandCol = rand2.nextInt(3);
            a [newrandRow][newrandCol] = String.valueOf('O');
        }
        for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "\t");
            }
            System.out.println();
            System.out.println();
        }

        System.out.println("Pick a row");
        Scanner kb7 = new Scanner(System.in);
        int row4 = kb.nextInt();
        System.out.println("Pick a column");
        Scanner kb8 = new Scanner(System.in);
        int column4 = kb2.nextInt();
        a [row4][column4] = String.valueOf('X');
        a [randRow4][randCol4] = String.valueOf('O');
        if (a[randRow4][randCol4] == a[row4][column4] )
        {
            int newrandRow = rand.nextInt(3);
            int newrandCol = rand2.nextInt(3);
            a [newrandRow][newrandCol] = String.valueOf('O');
        }
        for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "\t");
            }
            System.out.println();
            System.out.println();
        }

        if (a[0][0] == a[0][1])
        {
            System.out.println("Game over");
        }
        *//*if (move1.equals("2 3"))
        {
            System.out.println("   |      |   ");
            System.out.println("_______________");
            System.out.println("   |      | X ");
            System.out.println("_______________");
            System.out.println("   |      |   ");
        }
        */

    }
}