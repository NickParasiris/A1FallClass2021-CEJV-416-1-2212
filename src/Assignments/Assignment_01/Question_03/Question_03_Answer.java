package Assignments.Assignment_01.Question_03;

import java.util.Scanner;

public class Question_03_Answer {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String response;
        int triangleBase;
        int rectangleHeight;
        int rectangleWidth;
        String starR = "* ";
        String starT = "*";

        while (true)
        {
            System.out.println("""
                    Main Menu
                    1) Draw a triangle
                    2) Draw a rectangle
                    Q) Quit program""");
            response = s.nextLine();

            if (response.equalsIgnoreCase("1")) {
                do {
                    System.out.println("""
                            Triangle menu
                            1) Right sided triangle
                            2) Isosceles triangle
                            Q) Back to main menu""");
                    response = s.nextLine();
                    System.out.println();

                    if (response.equalsIgnoreCase("1")) {
                        System.out.println("Enter the size of the base for the triangle.");
                        if (s.hasNextInt()) {
                            triangleBase = s.nextInt();
                        } else
                            triangleBase = -1;

                        s.nextLine();

                        while (triangleBase < 1) {
                            System.out.println("Please enter a positive integer.");

                            if (s.hasNextInt()) {
                                triangleBase = s.nextInt();
                            } else
                                triangleBase = -1;

                            s.nextLine();
                        }

                        for (int x = 1; x <= triangleBase; x++) {
                            for (int y = 1; y <= x; y++) {
                                System.out.print(starT);
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }

                    if (response.equalsIgnoreCase("2")) {
                        System.out.println("Enter the size of the base for the triangle. (The number must be a positive odd integer that is greater than 0)");
                        if (s.hasNextInt()) {
                            triangleBase = s.nextInt();
                            if (triangleBase % 2 == 0) {
                                triangleBase = -1;
                            }
                        } else
                            triangleBase = -1;

                        s.nextLine();

                        while (triangleBase < 1) {
                            System.out.println("Please enter a the correct value.");

                            if (s.hasNextInt()) {
                                triangleBase = s.nextInt();
                            } else
                                triangleBase = -1;

                            s.nextLine();
                        }


                        for (int x = 1; x <= triangleBase; x += 2) {
                            for (int y = triangleBase - x; y >= 1; y -= 2) {
                                System.out.print(" ");
                            }
                            for (int z = 1; z <= x; z++) {
                                System.out.print(starT);
                            }
                            System.out.println();
                        }
                    }

                } while (!response.equalsIgnoreCase("Q"));
            }
            if (response.equalsIgnoreCase("2"))
            {
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
            if (response.equalsIgnoreCase("Q"))
            {
                System.out.println("Now leaving the program");
                break;
            }

        }
    }
}
