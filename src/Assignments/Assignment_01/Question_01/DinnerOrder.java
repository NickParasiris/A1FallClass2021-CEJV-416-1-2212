package Assignments.Assignment_01.Question_01;

import java.util.Scanner;

public class DinnerOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfPeople;

        System.out.println("How many people are having dinner.");
        if (s.hasNextInt())
        {
            numberOfPeople = s.nextInt();

            if (numberOfPeople > 1)
                System.out.println("You have " + numberOfPeople + " people at the dinner table.");

            if (numberOfPeople == 1)
                System.out.println("You are alone for dinner.");

        } else
            numberOfPeople = -1;

        s.nextLine();

        while (numberOfPeople < 1)
        {
            System.out.println("Please enter a proper value.");
            if (s.hasNextInt())
            {
                numberOfPeople = s.nextInt();

                if (numberOfPeople > 1)
                    System.out.println("You have " + numberOfPeople + " people at the dinner table.");

                if (numberOfPeople == 1)
                    System.out.println("You are alone for dinner.");
            } else
            {
                numberOfPeople = -1;
            }
            s.nextLine();
        }

    }
}
