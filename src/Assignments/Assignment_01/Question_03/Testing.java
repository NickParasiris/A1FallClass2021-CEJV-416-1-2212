package Assignments.Assignment_01.Question_03;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int triangleBase;
        String starT = "*";

        System.out.println("Enter the size of the base for the triangle. (The number must be a positive odd integer that is greater than 0)");
        if (s.hasNextInt())
        {
            triangleBase = s.nextInt();
            if (triangleBase % 2 == 0)
            {
                triangleBase = -1;
            }
        } else
            triangleBase = -1;

        s.nextLine();

        while (triangleBase < 1)
        {
            System.out.println("Please enter a the correct value.");

            if (s.hasNextInt())
            {
                triangleBase = s.nextInt();
            } else
                triangleBase = -1;

            s.nextLine();
        }


        for (int x = 1; x <= triangleBase; x += 2)
        {
            for (int y = triangleBase - x; y >= 1; y -= 2)
            {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++)
            {
                System.out.print(starT);
            }
            System.out.println();
        }


    }
}
