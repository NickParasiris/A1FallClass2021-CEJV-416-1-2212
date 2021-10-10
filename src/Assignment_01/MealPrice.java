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
            String responsePrice1;
            System.out.println();
        }



    }
}
