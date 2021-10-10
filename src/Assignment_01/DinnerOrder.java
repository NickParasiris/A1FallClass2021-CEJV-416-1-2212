package Assignment_01;

import java.util.Scanner;

public class DinnerOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfPeople;

        String response2 = "You are alone for dinner.";
        String response3 = "Please enter a proper value.";

        System.out.println("How many people are having dinner. \n(Enter a value between 1 and 100)");
        if (s.hasNextInt())
        {
            numberOfPeople = s.nextInt();
            String response1 = "You have " + numberOfPeople + " people at the dinner table.";

            if (numberOfPeople > 1)
                System.out.println(response1);

            if (numberOfPeople == 1)
                System.out.println(response2);

        } else
            numberOfPeople = -1;
        s.nextLine();

        while (numberOfPeople < 1 || numberOfPeople > 100)
        {
            System.out.println(response3);
            if (s.hasNextInt())
            {
                numberOfPeople = s.nextInt();
            } else
            {
                numberOfPeople = -1;
            }
            s.nextLine();
        }











    }
}
