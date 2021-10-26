package Assignments.Assignment_01.Question_03;

import java.util.Scanner;

public class ISOTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        StringBuilder b = new StringBuilder();
        int triangleBase = s.nextInt();
//        int triangleHeight = triangleBase - 4;

//        for (int x = 1; x <= triangleHeight; x++)
//        {
//            for (int y = 1; y <= triangleHeight - x; y++)
//            {
//                b.append(" ");
//            }
//            for (int z = 1; z <= (x * 2) - 1; z++)
//            {
//                b.append("*");
//            }
//            b.append(System.lineSeparator());
//        }
//        System.out.println(b);

//        for(int x = 1; x <= triangleBase; x++)
//        {
//            for(int y = triangleBase; y >= x; y--)
//            {
//                System.out.print(" ");
//            }
//            if (x == 1)
//            {
//                for(int z = 1; z <= triangleBase; z++)
//                {
//                    System.out.print("*");
//                }
//            } else
//            {
//                for (int z = 2; z <= triangleBase * 2; z++)
//                {
//                    System.out.print("*");
//                }
//            }
//            for (int w = 1; w <= triangleBase; w++)
//            {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
        for (int i = 0; i < triangleBase; i++)
            System.out.println("    *********".substring(i, triangleBase + 2*i));

    }
}
