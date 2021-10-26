package Assignments.Assignment_01.Question_03;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int triangleBase = s.nextInt();
        String StarT = "*";

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
