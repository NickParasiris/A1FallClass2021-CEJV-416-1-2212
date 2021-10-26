package Assignments.Assignment_01.Question_03;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ShapeMaker rs = new ShapeMaker();
        int rectangleWidth;
        int rectangleHeight;
        String starR = "* ";


        System.out.println("Enter the height of the rectangle.");
        if (s.hasNextInt())
        {
            rectangleHeight = s.nextInt();
        } else
            rectangleHeight = -1;

        s.nextLine();

        while (rectangleHeight < 1)
        {
            System.out.println("Please enter a positive integer.");

            if (s.hasNextInt())
            {
                rectangleHeight = s.nextInt();
            } else
                rectangleHeight = -1;

            s.nextLine();
        }

        System.out.println("Now enter the width of the rectangle.");
        if (s.hasNextInt())
        {
            rectangleWidth = s.nextInt();
        } else
            rectangleWidth = -1;

        s.nextLine();

        while (rectangleWidth < 1)
        {
            System.out.println("Please enter a positive integer.");

            if (s.hasNextInt())
            {
                rectangleWidth = s.nextInt();
            } else
                rectangleWidth = -1;

            s.nextLine();
        }


        for (int x = 1; x <= rectangleHeight; x++)
        {
            for (int y = 0; y < rectangleWidth; y++) {
                System.out.print(starR);
            }
            System.out.println();
        }
    }
}
