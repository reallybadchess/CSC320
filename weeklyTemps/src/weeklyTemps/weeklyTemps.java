package weeklyTemps;

import java.util.ArrayList;
import java.util.Scanner;

public class weeklyTemps {

    public static void main(String[] args) {

        // two arraylists to hold the data. one for days, one for temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // day names, in order used to drive the loop
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday",
                              "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);

        // ask user for each days average temperature and store it
        for (int i = 0; i < dayNames.length; i++) {

            System.out.print("Enter the average temperature for " + dayNames[i] + ": ");

            // keep asking until a valid number is entered
            while (!input.hasNextDouble()) {
                System.out.println("That is not a valid number. Please try again.");
                input.next(); // clears the invalid entry so it is not read again
                System.out.print("Enter the average temperature for " + dayNames[i] + ": ");
            }

            double temp = input.nextDouble();
            days.add(dayNames[i]);
            temperatures.add(temp);
        }

        input.nextLine(); // clears leftover newline left behind by nextDouble()

        // keep asking until user enters week or a valid day name
        boolean validInput = false;

        while (!validInput) {

            System.out.println();
            System.out.println("Enter a day of the week (Monday-Sunday),");
            System.out.println("or type \"week\" to see the temperatures for the whole week.");
            System.out.print("Your choice: ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("week")) {

                double total = 0;

                // loop through both arrayLists and print each days temperature
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
                    total = total + temperatures.get(i);
                }

                // calc the weekly average, rounded to 1 decimal place
                double average = total / temperatures.size();
                average = Math.round(average * 10) / 10.0;

                System.out.println("Weekly average temperature: " + average + " degrees");

                validInput = true;

            } else {

                boolean dayFound = false;

                // loop through the days arrayList looking for a match
                for (int i = 0; i < days.size(); i++) {
                    if (days.get(i).equalsIgnoreCase(choice)) {
                        System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
                        dayFound = true;
                    }
                }

                if (dayFound) {
                    validInput = true;
                } else {
                    System.out.println(choice + " is not a valid day of the week. Please try again.");
                }
            }
        }

        input.close();
    }
}