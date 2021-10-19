package Assignments.Assignment_01.Question_01;

import java.text.NumberFormat;
import java.util.Scanner;

public class Question_01_Answer {
    public static void main(String[] args) {

        NumberFormat m = NumberFormat.getCurrencyInstance();
        Scanner s = new Scanner(System.in);

        //Using if statement and a while loop to check if the value is correct.
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

        //Same thing as before
        double mealPrice;
        System.out.println("What is the price of your meal. (Without tax)");
        if (s.hasNextDouble())
        {
            mealPrice = s.nextDouble();
            System.out.println("The price of the meal without taxes and tips is " + m.format(mealPrice));
        } else
            mealPrice = -1;

        s.nextLine();

        while (mealPrice < 1)
        {
            System.out.println("Please enter a proper value");

            if (s.hasNextDouble()) {
                mealPrice = s.nextDouble();
                System.out.println("The price of the meal is " + m.format(mealPrice));
            } else
                mealPrice = -1;

            s.nextLine();
        }

        String tipRating;
        double tipPercent = 0.0;
        String unknownValue = null;

        double great = .2;
        double good = .15;
        double basic = .1;
        double bad = 0.0;
        String begin = "What is your rating for the tip\n" +
                "(Great or Excellent 20%, Good 15%, Basic 10%, Bad 0%):";
        String not = "Not the correct value";

        /*
        Using a switch statement within a while loop, the while loop is just to repeat the code if
        the wrong value is put in.
        */
        while (true)
        {
            System.out.println();
            System.out.println(begin);
            tipRating = s.nextLine();

            switch (tipRating)
            {
                case "Excellent", "Great" -> tipPercent = great;
                case "Good" -> tipPercent = good;
                case "Basic" -> tipPercent = basic;
                case "Bad" -> tipPercent = bad;
                default -> unknownValue = not;
            }
            boolean equals1 = tipRating.equals("Excellent") ||
                    tipRating.equals("Great") ||
                    tipRating.equals("Good") ||
                    tipRating.equals("Basic") ||
                    tipRating.equals("Bad");

            if (equals1)
            {
                break;
            }
            else
                System.out.println(unknownValue);
        }

        //Printing out the information of the meal.
        double amountTipped = mealPrice * tipPercent;
        System.out.println("You are tipping " + m.format(amountTipped));

        double QST = .09975;
        double mealQST = mealPrice * QST;
        System.out.println("The QST adds " + m.format(mealQST) + " to the total cost.");

        double GST = .05;
        double mealGST = mealPrice * GST;
        System.out.println("The GST adds " + m.format(mealGST) + " to the total cost");

        double totalNoTip = mealPrice + mealGST + mealQST;
        System.out.println("The total price without tips is " + m.format(totalNoTip));

        double grandTotal = totalNoTip + amountTipped;
        System.out.println("The Grand total of the meal is " + m.format(grandTotal));

        double perPerson = grandTotal / numberOfPeople;
        System.out.println(m.format(perPerson));

    }
}
