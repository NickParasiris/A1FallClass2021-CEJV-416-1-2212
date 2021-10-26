package Assignments.Assignment_01.Question_03;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int triangleBase = s.nextInt();

        for (int x = 1; x <= triangleBase; x += 2)
        {
            for (int y = x ; y >= 1; y--)
            {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++)
            {
                System.out.print("*");
            }
            for (int y = x; y >= 1; y--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
