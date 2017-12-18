package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Let's play Tic Tac Toe");
        Scanner kb = new Scanner(System.in);
        String move1 = kb.nextLine();
        if (move1.equals("2 2"))
        {
            System.out.println("   |      |   ");
            System.out.println("_______________");
            System.out.println("   |  X   |   ");
            System.out.println("_______________");
            System.out.println("   |      |   ");
        }
        if (move1.equals("1 2"))
        {
            System.out.println("   |   X  |   ");
            System.out.println("_______________");
            System.out.println("   |      |   ");
            System.out.println("_______________");
            System.out.println("   |      |   ");
        }
        if (move1.equals("3 2"))
        {
            System.out.println("   |      |   ");
            System.out.println("_______________");
            System.out.println("   |      |   ");
            System.out.println("_______________");
            System.out.println("   |  X   |   ");
        }
        if (move1.equals("2 1"))
        {
            System.out.println("   |      |   ");
            System.out.println("_______________");
            System.out.println(" X |      |   ");
            System.out.println("_______________");
            System.out.println("   |      |   ");
        }
        if (move1.equals("2 3"))
        {
            System.out.println("   |      |   ");
            System.out.println("_______________");
            System.out.println("   |      | X ");
            System.out.println("_______________");
            System.out.println("   |      |   ");
        }
    }
}
