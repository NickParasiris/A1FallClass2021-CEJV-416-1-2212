package Assignment_01;

import java.text.NumberFormat;
import java.util.Scanner;

public class MealPrice {
    public static void main(String[] args) {

        NumberFormat m = NumberFormat.getCurrencyInstance();
        Scanner s = new Scanner(System.in);
        int mealPrice;

        System.out.println("What is the price of your meal. (Without tax)");
        if (s.hasNextInt())
        {
            mealPrice = s.nextInt();
            System.out.println("The price of the meal is " + m.format(mealPrice));
        } else
            mealPrice = -1;

        s.nextLine();

        while (mealPrice < 1)
        {
            System.out.println("Please enter a proper value");

            if (s.hasNextInt())
            {
                mealPrice = s.nextInt();
                System.out.println("The price of the meal is " + m.format(mealPrice));
            } else
                mealPrice = -1;

            s.nextLine();
        }

    }
}
