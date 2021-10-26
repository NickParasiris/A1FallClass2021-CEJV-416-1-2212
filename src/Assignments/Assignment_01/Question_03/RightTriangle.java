package Assignments.Assignment_01.Question_03;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int triangleBase;
        String StarT = "*";

        System.out.println("Enter the size of the base for the triangle.");
        if (s.hasNextInt())
        {
            triangleBase = s.nextInt();
        } else
            triangleBase = -1;

        s.nextLine();

        while (triangleBase < 1)
        {
            System.out.println("Please enter a positive integer.");

            if (s.hasNextInt())
            {
                triangleBase = s.nextInt();
            } else
                triangleBase = -1;

            s.nextLine();
        }

        for (int x = 1; x <= triangleBase; x++)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print(StarT);
            }
            System.out.println();
        }

    }
}
