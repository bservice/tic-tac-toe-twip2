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
        a [row1][column1] = "X";
        System.out.println("  " + a[row1][column1]+"  |       |     ");
        System.out.println("___________________");
        System.out.println("     |       |     ");
        System.out.println("___________________");
        System.out.println("     |       |     ");


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
