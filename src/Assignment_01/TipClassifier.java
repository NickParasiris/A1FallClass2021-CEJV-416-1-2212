package Assignment_01;

import java.text.NumberFormat;

import java.util.Scanner;

public class TipClassifier {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("What is you rating for the tip " +
                "\n(Great or Excellent 20%, Good 15%, Basic 10%, Bad 0%):\n");
        String tipRating = s.nextLine();
        double tipPercent = 0.0;
        String unknownValue = null;

        double great = .2;
        double good = .15;
        double basic = .1;
        double bad = 0.0;
        String not = "Not the correct value";

        boolean equals1 = tipRating.equals("Excellent") ||
                tipRating.equals("Great") ||
                tipRating.equals("Good") ||
                tipRating.equals("Basic") ||
                tipRating.equals("Bad");

        switch (tipRating)
        {
            case "Excellent", "Great" -> tipPercent = great;
            case "Good" -> tipPercent = good;
            case "Basic" -> tipPercent = basic;
            case "Bad" -> tipPercent = bad;
            default -> unknownValue = not;
        }

        NumberFormat p = NumberFormat.getPercentInstance();
        String formattedTip = p.format(tipPercent);

        if (equals1)
        {
            System.out.println("You tipped " + formattedTip);
        } else
        {
            System.out.println(unknownValue);
        }
        
        

    }
}
