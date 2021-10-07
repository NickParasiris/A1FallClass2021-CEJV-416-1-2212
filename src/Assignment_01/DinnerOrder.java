package Assignment_01;

import java.util.Scanner;

public class DinnerOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfPeople;
        String response2 = "You are alone for dinner.";
        String response3 = "Please enter a proper value.";

        while (true)
        {
            System.out.println("How many people are having dinner.");
            numberOfPeople = s.nextInt();
            if (numberOfPeople > 1)
            {
                String response1 = "You have " + numberOfPeople + " people at the dinner table.";
                System.out.println(response1);
                break;
            }

            if (numberOfPeople == 1)
            {
                System.out.println(response2);
                break;
            }
        }






    }
}
