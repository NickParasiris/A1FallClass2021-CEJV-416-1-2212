package Assignments.Assignment_01.Question_02;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        StringBuilder b = new StringBuilder();

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the size of the table. \n" +
                "(Must be an integer.)");
        int tableSize = s.nextInt();

//        System.out.print("\t");

//        for (int x = 1; x <= tableSize; x++)
//        {
//            for (int y = 1; y <= tableSize; y++)
//            {
//                System.out.print(x * y + "\t");
//            }
//            System.out.println();
//        }



        System.out.print("\t");

        for (int y = 1; y <= tableSize; y++)
        {
            System.out.print("\t" + y);
        }

        System.out.println();
        System.out.print("------");

        for (int z =1; z <= tableSize; z++)
        {
            System.out.print("----");
        }

        System.out.println();

        for (int x = 1; x <= tableSize; x++)
        {
            System.out.println(x + "\t|");
        }




    }
}
