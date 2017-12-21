package com.company;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Let's play Tic Tac Toe");
        System.out.println("Pick coordinates for your moves (ex: 0 1 )");
        System.out.println("Pick a row");
        Scanner kb = new Scanner(System.in);
        int row1 = kb.nextInt();
        System.out.println("Pick a column");
        Scanner kb2 = new Scanner(System.in);
        int column1 = kb2.nextInt();
        String a [][] = new String [3][3];
        a[0][0] = String.valueOf('-');
        a[0][1] = String.valueOf('-');
        a[0][2] = String.valueOf('-');
        a[1][0] = String.valueOf('-');
        a[1][1] = String.valueOf('-');
        a[1][2] = String.valueOf('-');
        a[2][0] = String.valueOf('-');
        a[2][1] = String.valueOf('-');
        a[2][2] = String.valueOf('-');
        a [row1][column1] = String.valueOf('X');
        Random rand = new Random();
        Random rand2 = new Random();
        int randRow = rand.nextInt(3);
        int randCol = rand2.nextInt(3);

        a [randRow][randCol] = String.valueOf('O');
       for (int i = 0; i <= 2; i++)
        {
            for (int j= 0; j<=2; j++)
            {
                System.out.print(a[i][j]+ "\t" + "\t");
            }
            System.out.println();
            System.out.println();
        }

        /*if (move1.equals("2 3"))
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
