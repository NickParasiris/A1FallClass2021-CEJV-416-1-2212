package Assignments.Assignment_01.Question_02;

import java.util.Scanner;

public class Question_02_Answer {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int tableSize;

        System.out.println("Please enter the size of the table. \n" + "(Must be an integer.)");
        if (s.hasNextInt())
        {
            tableSize = s.nextInt();
            System.out.println("The size of the table is " + tableSize);
        } else
            tableSize = -1;

        s.nextLine();

        while (tableSize < 1)
        {
            System.out.println("Please enter a proper value");

            if (s.hasNextInt())
            {
                tableSize = s.nextInt();
                System.out.println("The size of the table is " + tableSize);
            } else
                tableSize = -1;

            s.nextLine();
        }

        System.out.print("\t");

        for (int y = 1; y <= tableSize; y++)
        {
            System.out.print("\t" + y);
        }


        System.out.println();
        System.out.print("------");

        for (int z = 1; z <= tableSize; z++)
        {
            System.out.print("----");
        }
        System.out.println();

        for (int x = 1; x <= tableSize; x++)
        {
            System.out.print(x + "\t|\t");

            for (int y = 1; y <= tableSize; y++)
            {
                System.out.print(x * y + "\t");
            }

            System.out.println();
        }

    }
}
