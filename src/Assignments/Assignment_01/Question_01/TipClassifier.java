package Assignments.Assignment_01.Question_01;

import java.text.NumberFormat;

import java.util.Scanner;

public class TipClassifier {
    public static void main(String[] args) {

        NumberFormat p = NumberFormat.getPercentInstance();
        Scanner s = new Scanner(System.in);
        String tipRating;
        double tipPercent = 0;
        String unknownValue = null;

        double great = .2;
        double good = .15;
        double basic = .1;
        double bad = 0.0;
        String begin = "What is your rating for the tip\n" +
                "(Great or Excellent 20%, Good 15%, Basic 10%, Bad 0%):";
        String not = "Not the correct value";

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
            {
                System.out.println(unknownValue);
            }

        }
        System.out.println(tipPercent);


    }
}
